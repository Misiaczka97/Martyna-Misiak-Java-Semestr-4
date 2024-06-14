package r03.r03_07;

public class ScopeDemo
{
    public static void main(String[] args)
    {
        repeatMessage("Witaj", 10);
        
        for (String a : args) {
            new Thread(() -> System.out.println(a)).start();
        }
    }

    public static void repeatMessage(String text, int count)
    {
        Runnable r = () -> {
            for (int j = 0; j < count; ++j)
            {
                System.out.println(j + ": " + text);
            }
        };
        new Thread(r).start();
    }
}

