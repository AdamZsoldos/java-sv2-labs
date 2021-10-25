package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Washing Dishes", "Clean dirty dishes.");
        task.setDuration(10);
        task.start();

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());
    }
}
