package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem catalogItemToDelete = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                catalogItemToDelete = catalogItem;
                break;
            }
        }
        if (catalogItemToDelete != null) {
            catalogItems.remove(catalogItemToDelete);
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    sum += ((PrintedFeatures) feature).getNumberOfPages();
                }
            }
        }
        return sum;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof AudioFeatures) {
                    sum += ((AudioFeatures) feature).getLength();
                }
            }
        }
        return sum;
    }

    public double averagePageNumberOver(int minNumberOfPages) {
        if (minNumberOfPages < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int total = 0;
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof PrintedFeatures && ((PrintedFeatures) feature).getNumberOfPages() >= minNumberOfPages) {
                    total++;
                    sum += ((PrintedFeatures) feature).getNumberOfPages();
                }
            }
        }
        if (total < 1) {
            throw new IllegalArgumentException("No page");
        }
        return (double) sum / total;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (getItemMatchesSearchCriteria(catalogItem, searchCriteria)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private boolean getItemMatchesSearchCriteria(CatalogItem catalogItem, SearchCriteria searchCriteria) {
        if (searchCriteria.hasTitle() && !catalogItem.getTitles().contains(searchCriteria.getTitle())) {
            return false;
        }
        if (searchCriteria.hasContributor() && !catalogItem.getContributors().contains(searchCriteria.getContributor())) {
            return false;
        }
        return true;
    }
}
