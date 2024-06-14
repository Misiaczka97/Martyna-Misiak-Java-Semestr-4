package Lab07.Zadania.Zadanie25a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie25a {
    public static void main(String[] args) {
        String input = "123 -456 789";
        ArrayList<Integer> numbers = new ArrayList<>();

        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        System.out.println("Znalezione liczby: " + numbers);
    }
}
