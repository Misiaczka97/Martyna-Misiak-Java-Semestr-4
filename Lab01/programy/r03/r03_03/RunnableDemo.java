package r03.r03_03;

public class RunnableDemo
{
    public static void main(String[] args)
    {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Wątek uruchomiony");
    }
}

class HelloTask implements Runnable
{
    public void run()
    {
        for (int j = 0; j < 10; ++j) {
            System.out.println("Witaj, świecie!");
        }
    }
}

