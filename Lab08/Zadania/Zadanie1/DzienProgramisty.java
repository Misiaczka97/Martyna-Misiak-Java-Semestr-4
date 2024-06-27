import java.time.LocalDate;

public class DzienProgramisty {
    public static void main(String[] args) {
        // Rok
        int year = 2024;

        // Sprawdź, czy rok jest przestępny
        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();

        // Oblicz 256. dzień roku
        LocalDate dayOfProgrammer = isLeapYear ? LocalDate.of(year, 1, 1).plusDays(255) : LocalDate.of(year, 1, 1).plusDays(255);

        System.out.println("Dzień Programisty w roku " + year + " przypada na: " + dayOfProgrammer);
    }
}
