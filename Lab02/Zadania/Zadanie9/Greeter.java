public class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Witaj, " + target);
        }
    }

    public static void main(String[] args) {
        Runnable greeter1 = new Greeter(5, "Świecie");
        Runnable greeter2 = new Greeter(5, "Przyjacielu");

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    }
}
