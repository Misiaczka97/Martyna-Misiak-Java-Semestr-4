import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie20 {
    public static void main(String[] args) {
        String input = "I saw a terrible rat running through the forest.";
        
        String regex = "r\\w{2}";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
