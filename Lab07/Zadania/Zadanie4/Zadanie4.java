import java.util.regex.Pattern;

public class Zadanie4 {
    public static void main(String[] args) {
        String regex = "^ab*$";
        String input = "abbb";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch pasuje do wzorca? " + matches);
    }
}
