import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie15 {
    public static void main(String[] args) {
        String regex = "\\b[a-zA-Z0-9_]+\\b";
        String input = "This_is_a_test_123";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Znaleziono: " + matcher.group());
        }
    }
}
