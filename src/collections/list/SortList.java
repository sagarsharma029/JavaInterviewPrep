//Day 5 - Q3

package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    static class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class SalaryComparator implements Comparator<Employee> {

        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.salary, e2.salary);
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 5000));
        list.add(new Employee("Alice", 3000));
        list.add(new Employee("Sagar", 6500));

        Collections.sort(list, new SalaryComparator());

        for (Employee e : list) {
            System.out.println(e.salary);
        }
    }
}