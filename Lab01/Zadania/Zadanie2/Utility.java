// Rzutowanie ((Employee) largest(employees)) 
// jest używane, aby uzyskać dostęp do specyficznych
// metod klasy Employee, takich jak getName().

public class Utility {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return objects.length == 0 ? 0 : sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        if (objects.length == 0) return null;
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 70000)
        };

        System.out.println("Average salary: " + average(employees));
        Employee highestPaid = (Employee) largest(employees);
        System.out.println("Highest paid: " + highestPaid.getName());
    }
}