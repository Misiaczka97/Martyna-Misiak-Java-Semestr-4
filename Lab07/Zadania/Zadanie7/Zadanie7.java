import java.util.regex.Pattern;

public class Zadanie7 {
    public static void main(String[] args) {
        String regex = "^ab{2,3}$";
        String input = "abbb";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch pasuje do wzorca? " + matches);
    }
}
