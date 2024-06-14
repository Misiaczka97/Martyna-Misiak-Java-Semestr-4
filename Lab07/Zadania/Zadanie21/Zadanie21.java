import java.util.regex.Pattern;

public class Zadanie21 {
    public static void main(String[] args) {
        String regex = "^[+-]?\\d+(\\.\\d+)?$";
        String input = "-10.23";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy liczba zmiennoprzecinkowa ma poprawny format? " + matches);
    }
}
