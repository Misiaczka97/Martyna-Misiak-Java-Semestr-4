import java.util.regex.Pattern;

public class Zadanie6 {
    public static void main(String[] args) {
        String regex = "^ab{3}$";
        String input = "abbb";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch pasuje do wzorca? " + matches);
    }
}
