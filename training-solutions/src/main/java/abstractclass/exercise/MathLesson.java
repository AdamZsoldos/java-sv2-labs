package abstractclass.exercise;

import java.util.Arrays;
import java.util.List;

public class MathLesson {

    public static void main(String[] args) {
        List<MathExercise> math = Arrays.asList(new Adder(), new Subtractor(), new Multiplier(), new Divider());
        System.out.println(math.get(0).getSolution(10, 2));
        System.out.println(math.get(1).getSolution(10, 2));
        System.out.println(math.get(2).getSolution(10, 2));
        System.out.println(math.get(3).getSolution(10, 2));
    }
}
