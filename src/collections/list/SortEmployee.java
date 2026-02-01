//Day 6 - Q1

package collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

    static class Employee implements Comparable<Employee>{
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee other) {
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 5000));
        list.add(new Employee("Alice", 3000));
        list.add(new Employee("Sagar", 6500));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.name);
        }
    }
}