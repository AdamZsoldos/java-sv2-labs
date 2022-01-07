package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composers;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        validateTitle(title);
        validateLength(length);
        validatePerformers(performers);
        composers = new ArrayList<>();
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composers) {
        validateTitle(title);
        validateLength(length);
        validatePerformers(performers);
        validateComposers(composers);
        this.composers = composers;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        contributors.addAll(composers);
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void validateLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Invalid length");
        }
    }

    private void validatePerformers(List<String> performers) {
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty performers list");
        }
    }

    private void validateComposers(List<String> composers) {
        if (Validators.isEmpty(composers)) {
            throw new IllegalArgumentException("Empty composers list");
        }
    }
}
