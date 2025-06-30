package task_4;

import java.util.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Alice", 50000, new Date(120, 1, 1), "AB123");
        Employee e2 = new Employee("Bob", 60000, new Date(119, 5, 10), "CD456");

        Manager m1 = new Manager("Bob_another", 70000, new Date(118, 3, 15), "EF789", 10000);
        m1.addTeam(e1);
        m1.addTeam(e2);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(m1);

        System.out.println("\nEquality check:");
        System.out.println(e1.equals(e2));
        System.out.println(m1.equals(m1.clone()));

        System.out.println("\nCompare employees by salary:");
        System.out.println(e1.compareTo(e2)); // < 0

        System.out.println("\nSorting by name:");
        List<Employee> all = new ArrayList<>();
        all.add(e2);
        all.add(e1);
        all.add(m1);

        all.sort(new NameComparator());
        all.forEach(System.out::println);

        System.out.println("\nSorting by hire date:");
        all.sort(new HireDateComparator());
        all.forEach(System.out::println);
    }
}
