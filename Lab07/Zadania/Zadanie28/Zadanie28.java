import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie28 {
    public static void main(String[] args) {
        String regex = "(\\d{3})-(\\d{2})-(\\d{4})";
        String input = "123-45-6789";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        String result = matcher.replaceAll("$1$2$3");
        System.out.println("Zmieniony tekst: " + result);
    }
}
