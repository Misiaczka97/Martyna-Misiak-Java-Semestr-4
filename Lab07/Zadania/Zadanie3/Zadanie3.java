import java.util.regex.Pattern;

public class Zadanie3 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9]+$";
        String input = "Example123";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch zawiera tylko dozwolone znaki? " + matches);
    }
}
