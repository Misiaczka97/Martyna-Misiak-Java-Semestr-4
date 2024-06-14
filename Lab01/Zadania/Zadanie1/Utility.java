public class Utility {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return objects.length == 0 ? 0 : sum / objects.length;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 70000)
        };

        System.out.println("Average salary: " + average(employees));
    }
}