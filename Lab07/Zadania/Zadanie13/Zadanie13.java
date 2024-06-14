import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie13 {
    public static void main(String[] args) {
        String regex = "\\b\\w*z\\w*\\b";
        String input = "crazy zebra buzzes options";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Znaleziono: " + matcher.group());
        }
    }
}
