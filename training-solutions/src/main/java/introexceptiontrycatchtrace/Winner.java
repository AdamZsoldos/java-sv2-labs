package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private final List<String> names = Arrays.asList("John Doe", "Jane Roe", "Jill Poe", null, "Jack Woe");

    public String getWinner() {
        return names.get(new Random().nextInt(names.size())).toUpperCase();
    }
}
