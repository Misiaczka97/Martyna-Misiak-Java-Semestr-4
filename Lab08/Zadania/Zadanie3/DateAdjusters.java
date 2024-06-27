import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.function.Predicate;

public class DateAdjusters {
    public static void main(String[] args) {
        // Bieżąca data
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // Znajdź następny dzień roboczy
        LocalDate nextWorkingDay = today.with(nastepny(w -> w.getDayOfWeek().getValue() < DayOfWeek.SATURDAY.getValue()));
        System.out.println("Next working day: " + nextWorkingDay);
    }

    // Metoda nastepny przyjmująca predykat i zwracająca modyfikator daty
    public static java.time.temporal.TemporalAdjuster nastepny(Predicate<LocalDate> predicate) {
        return temporal -> {
            LocalDate result = LocalDate.from(temporal);
            do {
                result = result.plusDays(1);
            } while (!predicate.test(result));
            return result;
        };
    }
}
