package collectionsclass.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private final List<ExamResult> results;

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<ExamResult> getResults() {
        return results;
    }

    public List<String> getNamesOfAdmittees(int numberOfAdmittees) {
        if (results.size() < numberOfAdmittees) {
            throw new IllegalArgumentException("Not enough applicants");
        }
        List<String> names = new ArrayList<>();
        List<ExamResult> sortedResults = new ArrayList<>(List.copyOf(results));
        Collections.sort(sortedResults);
        Collections.reverse(sortedResults);
        for (int i = 0; i < numberOfAdmittees && i < sortedResults.size(); i++) {
            names.add(sortedResults.get(i).getApplicantName());
        }
        return names;
    }

    public List<String> getNamesOfAdmitteesWithStream(int numberOfAdmittees) {
        if (results.size() < numberOfAdmittees) {
            throw new IllegalArgumentException("Not enough applicants");
        }
        return results.stream()
                .sorted(Comparator.reverseOrder())
                .limit(numberOfAdmittees)
                .map(ExamResult::getApplicantName)
                .toList();
    }
}
