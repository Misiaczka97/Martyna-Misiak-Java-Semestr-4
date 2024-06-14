import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie23 {
    public static void main(String[] args) {
        String regex = "\\bc\\w{2}\\b";
        String input = "cat camera can pen cow cab cot";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll(m -> m.group().toUpperCase());
        System.out.println("Wynik: " + result);
    }
}
