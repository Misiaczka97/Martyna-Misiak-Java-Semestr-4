import java.util.regex.Pattern;

public class Zadanie11 {
    public static void main(String[] args) {
        String regex = "^\\w+";
        String input = "word at the beginning";

        boolean matches = Pattern.matches(regex, input.split(" ")[0]);
        System.out.println("Czy pierwsze słowo pasuje do wzorca? " + matches);
    }
}
