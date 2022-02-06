package activity;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Track {

    private final List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getDistance() {
        double distance = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return distance;
    }

    public double getFullElevation() {
        double elevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            elevation += Math.max(0, trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation());
        }
        return elevation;
    }

    public double getFullDecrease() {
        double decrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            decrease += Math.max(0, trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation());
        }
        return decrease;
    }

    public Coordinate findMinimumCoordinate() {
        validateTrackPointsListNotEmpty();
        double minLatitude = Double.MAX_VALUE;
        double minLongitude = Double.MAX_VALUE;
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minLatitude) {
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        validateTrackPointsListNotEmpty();
        double maxLatitude = Double.MIN_VALUE;
        double maxLongitude = Double.MIN_VALUE;
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() > maxLatitude) {
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxLongitude) {
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    private void validateTrackPointsListNotEmpty() {
        if (trackPoints.isEmpty()) {
            throw new NoSuchElementException("Track point list is empty");
        }
    }

    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();
        return (max.getLatitude() - min.getLatitude()) * (max.getLongitude() - min.getLongitude());
    }

    public void loadFromGpx(InputStream inputStream) {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
            parseDocument(doc);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            throw new IllegalStateException("Error while reading file", e);
        }
    }

    private void parseDocument(Document doc) {
        NodeList nodes = doc.getElementsByTagName("trkpt");
        for (int i = 0; i < nodes.getLength(); i++) {
            trackPoints.add(parseNode(nodes.item(i)));
        }
    }

    private TrackPoint parseNode(Node node) {
        double latitude = Double.parseDouble(node.getAttributes().getNamedItem("lat").getTextContent());
        double longitude = Double.parseDouble(node.getAttributes().getNamedItem("lon").getTextContent());
        double elevation = 0;
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            if ("ele".equals(node.getChildNodes().item(i).getNodeName())) {
                elevation = Double.parseDouble(node.getChildNodes().item(i).getTextContent());
                break;
            }
        }
        return new TrackPoint(new Coordinate(latitude, longitude), elevation);
    }
}
