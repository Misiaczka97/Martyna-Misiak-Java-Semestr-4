import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie8 {
    public static void main(String[] args) {
        String regex = "\\b[a-z]+_[a-z]+\\b";
        String input = "example_test case";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Znaleziono: " + matcher.group());
        }
    }
}
