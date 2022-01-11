package collectionsqueue.todo;

import java.util.*;

public class ToDoList {

    List<ToDo> list = new ArrayList<>();

    public List<ToDo> getList() {
        return list;
    }

    public Deque<ToDo> getListInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo toDo : list) {
            if (toDo.isUrgent()) {
                result.push(toDo);
            } else {
                result.add(toDo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.getList().add(new ToDo("Wash dishes", false));
        toDoList.getList().add(new ToDo("Hang out laundry", true));
        toDoList.getList().add(new ToDo("Take out garbage", false));
        toDoList.getList().add(new ToDo("Order food", true));
        toDoList.getList().add(new ToDo("Wash car", false));
        Deque<ToDo> urgencyList = toDoList.getListInUrgencyOrder();
        System.out.println(urgencyList);
        System.out.println(urgencyList.pop());
    }
}
