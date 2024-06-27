import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysLived {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobierz datę urodzenia użytkownika
        System.out.println("Enter your birth year:");
        int year = scanner.nextInt();
        System.out.println("Enter your birth month:");
        int month = scanner.nextInt();
        System.out.println("Enter your birth day:");
        int day = scanner.nextInt();

        // Utworzenie obiektu LocalDate reprezentującego datę urodzenia
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Pobierz bieżącą datę
        LocalDate currentDate = LocalDate.now();

        // Obliczenie liczby dni między datą urodzenia a bieżącą datą
        long daysLived = ChronoUnit.DAYS.between(birthDate, currentDate);

        // Wyświetlenie wyniku
        System.out.println("You have lived " + daysLived + " days.");
    }
}
