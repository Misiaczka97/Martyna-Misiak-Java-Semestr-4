import java.util.Arrays;
import java.util.Comparator;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", 50000),
            new Employee("Jane", 60000),
            new Employee("Jim", 55000),
            new Employee("John", 55000)
        };

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary)
                                         .thenComparing(Employee::getName));
        System.out.println("Sorted by salary, then name:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed()
                                         .thenComparing(Employee::getName));
        System.out.println("Sorted by salary in reverse, then name:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }
    }
}
