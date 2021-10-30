package stringmethods.urlmanager;

public class UrlManagerMain {
    public static void main(String[] args) {

        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov:2000/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Query: " + urlManager.getQuery());
        System.out.println("URL: " + urlManager.getUrl());
        System.out.println("hasProperty(\"format\"): " + urlManager.hasProperty("format"));
        System.out.println("getProperty(\"format\"): " + urlManager.getProperty("format"));
        System.out.println("hasProperty(\"formats\"): " + urlManager.hasProperty("formats"));
        System.out.println("getProperty(\"formats\"): " + urlManager.getProperty("formats"));
        System.out.println();

        urlManager = new UrlManager("http://www.google.com/");

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Query: " + urlManager.getQuery());
        System.out.println("URL: " + urlManager.getUrl());
        System.out.println("hasProperty(\"format\"): " + urlManager.hasProperty("format"));
        System.out.println("getProperty(\"format\"): " + urlManager.getProperty("format"));
    }
}
