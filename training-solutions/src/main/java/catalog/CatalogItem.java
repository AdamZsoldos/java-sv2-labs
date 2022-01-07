package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final List<Feature> features;
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.features = Arrays.asList(features);
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int numberOfPagesAtOneItem() {
        int totalNumberOfPages = 0;
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                totalNumberOfPages += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return totalNumberOfPages;
    }

    public int fullLengthAtOneItem() {
        int totalLength = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                totalLength += ((AudioFeatures) feature).getLength();
            }
        }
        return totalLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature : features) {
            contributors.addAll(feature.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
}
