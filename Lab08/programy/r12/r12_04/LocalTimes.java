package r12.r12_04;

import java.time.LocalTime;

public class LocalTimes
{
    public static void main(String[] args)
    {
        LocalTime rightNow = LocalTime.now();
        LocalTime bedtime = LocalTime.of(22, 30);
        bedtime = LocalTime.of(22, 30, 0);
        System.out.println("teraz: " + rightNow);
        System.out.println("spanie: " + bedtime);
        LocalTime wakeup = bedtime.plusHours(8); // pobudka o 6:30
        System.out.println("pobudka: " + wakeup);
    }
}
