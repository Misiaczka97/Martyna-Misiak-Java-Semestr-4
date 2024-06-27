import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Cal {
    public static void main(String[] args) {
        // Sprawdzenie argumentów
        if (args.length != 2) {
            System.out.println("Usage: java Cal <month> <year>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        // Utworzenie obiektu LocalDate dla pierwszego dnia miesiąca
        LocalDate date = LocalDate.of(year, month, 1);

        // Wyświetlenie nagłówka
        System.out.println(date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Ustalenie dnia tygodnia dla pierwszego dnia miesiąca
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        int dayOfWeekValue = firstDayOfWeek.getValue() % 7; // Przekształcenie poniedziałku na 0, niedzieli na 6

        // Wydrukowanie pustych miejsc dla dni przed pierwszym dniem miesiąca
        for (int i = 0; i < dayOfWeekValue; i++) {
            System.out.print("   ");
        }

        // Wydrukowanie dni miesiąca
        while (date.getMonthValue() == month) {
            System.out.printf("%2d ", date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            date = date.plusDays(1);
        }

        // Nowa linia po zakończeniu miesiąca
        if (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            System.out.println();
        }
    }
}
