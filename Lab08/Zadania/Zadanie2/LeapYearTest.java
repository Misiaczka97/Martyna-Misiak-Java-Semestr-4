import java.time.LocalDate;

public class LeapYearTest {
    public static void main(String[] args) {
        // Utworzenie obiektu LocalDate reprezentującego datę 29 lutego 2000 roku
        LocalDate leapDay2000 = LocalDate.of(2000, 2, 29);
        System.out.println("Original date: " + leapDay2000);

        // Dodanie jednego roku do daty
        LocalDate nextYear = leapDay2000.plusYears(1);
        // Wynik: 28 lutego 2001 roku, ponieważ 2001 rok nie jest przestępny
        System.out.println("After adding one year: " + nextYear);

        // Dodanie czterech lat do daty
        LocalDate fourYearsLater = leapDay2000.plusYears(4);
        // Wynik: 29 lutego 2004 roku, ponieważ 2004 rok jest przestępny
        System.out.println("After adding four years: " + fourYearsLater);
    }
}
