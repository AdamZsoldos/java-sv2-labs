package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable {

    private final List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (nextStep()) {}
    }

    private boolean nextStep() {
        tasks.remove(tasks.size() - 1);
        return !tasks.isEmpty();
    }
}
