package streamsalgorithms;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jill Doe", 1970),
                new Employee("Jack Roe", 1992),
                new Employee("Jeff Poe", 1967)
        );

        System.out.print("Sum of year of birth: ");
        System.out.println(employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum()
        );

        System.out.print("Sum of age: ");
        System.out.println(employees.stream()
                .mapToInt(employee -> LocalDate.now().getYear() - employee.getYearOfBirth())
                .sum()
        );

        System.out.print("Total employees: ");
        System.out.println(employees.stream().count());

        System.out.print("Total employees born before 1990: ");
        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count()
        );

        System.out.print("Oldest employee's year of birth: ");
        System.out.println(employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min().getAsInt()
        );

        System.out.print("Oldest employee's name: ");
        System.out.println(employees.stream()
                .min(Comparator.comparing(Employee::getYearOfBirth))
                .orElseThrow().getName()
        );

        System.out.print("All employees born before 1980: ");
        System.out.println(employees.stream().noneMatch(employee -> employee.getYearOfBirth() >= 1980));

        System.out.print("List of employees born before 1990: ");
        System.out.println(employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).toList());

        System.out.print("Names of employees: ");
        System.out.println(employees.stream().map(Employee::getName).toList());

        System.out.print("Names of employees born before 1990: ");
        System.out.println(employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .toList()
        );
    }
}
