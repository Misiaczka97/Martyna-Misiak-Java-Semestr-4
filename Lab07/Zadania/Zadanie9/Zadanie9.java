import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie9 {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]+\\b";
        String input = "Example Test Case";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Znaleziono: " + matcher.group());
        }
    }
}
