package collectionsqueue.vaccine;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jill", 17));
        people.add(new Person("John", 18));
        people.add(new Person("Jane", 65));
        people.add(new Person("Jack", 66));
        people.add(new Person("Jim", 50));
        people.add(new Person("Jen", 32));
        Queue<Integer> vaccinationOrder = getVaccinationOrder(people);
        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
    }

    public static Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> ages = new PriorityQueue<>();
        for (Person person : people) {
            if (person.getAge() >= 18 && person.getAge() <= 65) {
                ages.add(person.getAge());
            }
        }
        return ages;
    }
}
