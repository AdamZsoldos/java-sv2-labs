package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Run {

    String name;
    List<Double> distanceList = new ArrayList<>();

    public Run(String name) {
        this.name = name;
    }

    public void add(double km) {
        distanceList.add(km);
    }

    public String getFormattedRunText() {
        return String.format(new Locale("hu", "HU"), "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!", name, LocalDate.now(), distanceList.size(), distanceList.get(distanceList.size() - 1));
    }

    public static void main(String[] args) {
        Run run = new Run("Jane Doe");
        run.add(7.356);
        run.add(9.54343);
        run.add(4.36367);
        run.add(11.346);
        System.out.println(run.getFormattedRunText());
    }
}
