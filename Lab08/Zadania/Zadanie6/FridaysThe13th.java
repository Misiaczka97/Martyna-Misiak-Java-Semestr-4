import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridaysThe13th {
    public static void main(String[] args) {
        int startYear = 1900;
        int endYear = 1999;

        // Iteracja przez każdy rok XX wieku
        for (int year = startYear; year <= endYear; year++) {
            // Iteracja przez każdy miesiąc
            for (int month = 1; month <= 12; month++) {
                // Utworzenie obiektu LocalDate dla trzynastego dnia danego miesiąca i roku
                LocalDate date = LocalDate.of(year, month, 13);
                // Sprawdzenie, czy trzynasty dzień miesiąca jest piątkiem
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    // Wyświetlenie daty, jeśli jest to piątek trzynastego
                    System.out.println(date);
                }
            }
        }
    }
}
