import java.util.regex.Pattern;

public class Zadanie17 {
    public static void main(String[] args) {
        String regex = "^[+-]?\\d*(\\.\\d+)?$";
        String input = "123.456";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy liczba ma poprawny format? " + matches);
    }
}
