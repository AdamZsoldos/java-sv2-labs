package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        Operations op = new Operations();
        try {
            System.out.println(op.getDailySchedule(op.readFile(), '2'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("files/underground.txt"));
    }

    private String getDailySchedule(List<String> ids, char firstChar) {
        StringBuilder result = new StringBuilder(LocalDate.now().toString()).append(',');
        for (String id : ids) {
            if (id.charAt(0) == firstChar) result.append(' ').append(id);
        }
        return result.toString();
    }
}
