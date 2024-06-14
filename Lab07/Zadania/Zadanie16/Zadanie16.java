import java.util.regex.Pattern;

public class Zadanie16 {
    public static void main(String[] args) {
        String regex = "^[0-9].*";
        String input = "1test";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch zaczyna się od cyfry? " + matches);
    }
}
