import java.util.regex.Pattern;

public class Zadanie12 {
    public static void main(String[] args) {
        String regex = "\\w+[.!?]?$";
        String input = "end of the sentence.";

        boolean matches = Pattern.matches(regex, input.split(" ")[input.split(" ").length - 1]);
        System.out.println("Czy ostatnie słowo pasuje do wzorca? " + matches);
    }
}
