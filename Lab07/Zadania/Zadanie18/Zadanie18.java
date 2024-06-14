import java.util.regex.Pattern;

public class Zadanie18 {
    public static void main(String[] args) {
        String regex = "^\\d+[A-Za-z]?\\\\\\d+[A-Za-z]?$";
        String input = "123\\2A";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy numer domu ma poprawny format? " + matches);
    }
}
