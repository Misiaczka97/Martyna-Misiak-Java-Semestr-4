import java.util.regex.Pattern;

public class Zadanie22 {
    public static void main(String[] args) {
        String regex = "^\\d+[A-Za-z]?\\\\\\d+[A-Za-z]?$";
        String input = "24B\\3";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy numer domu ma poprawny format? " + matches);
    }
}
