package r12.r12_03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAdjusters
{
    public static void main(String[] args)
    {
        int year = 2024;
        int month = 5;
        LocalDate firstTuesday = LocalDate
            .of(year, month, 1)
            .with(TemporalAdjusters
            .nextOrSame(DayOfWeek.TUESDAY));
        System.out.println("pierwszyWtorek: " + firstTuesday);
        
        LocalDate today = LocalDate.of(2024, 5, 11); // Sobota
        TemporalAdjuster NEXT_WORKDAY = w -> {
            LocalDate result = (LocalDate) w;
            do
            {
                result = result.plusDays(1);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        };
        LocalDate backToWork = today.with(NEXT_WORKDAY);
        System.out.println("powrótDoPracy: " + backToWork);
        
        TemporalAdjuster NEXT_WORKDAY2 = TemporalAdjusters.ofDateAdjuster(w -> {
            LocalDate result = w; // No cast
            do
            {
                result = result.plusDays(1);
                // System.out.println(result);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        });
        backToWork = today.with(NEXT_WORKDAY2);
        System.out.println("powrótDoPracy: " + backToWork);
    }
}

