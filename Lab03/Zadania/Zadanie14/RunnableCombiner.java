public class RunnableCombiner {
    public static Runnable combineRunnables(Runnable... tasks) {
        return () -> {
            for (Runnable task : tasks) {
                task.run();
            }
        };
    }

    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task 1");
        Runnable task2 = () -> System.out.println("Task 2");
        Runnable task3 = () -> System.out.println("Task 3");

        Runnable combined = combineRunnables(task1, task2, task3);
        combined.run();
    }
}
