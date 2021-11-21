package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        Scanner scanner = new Scanner(System.in);
        while (toDo.addToDo(scanner)) {}
        toDo.writeToDoList();
    }

    private boolean addToDo(Scanner scanner) {
        System.out.println("Enter to-do entry or the letter X to finish list:");
        String s = scanner.nextLine().trim();
        if (s.equalsIgnoreCase("X")) return false;
        toDoList.add(s);
        return true;
    }

    private void writeToDoList() {
        try {
            Files.write(Paths.get("files/todo.txt"), toDoList);
        } catch (IOException ioe) {
            System.out.println("Cannot write file");
            ioe.printStackTrace();
        }
    }
}
