import java.util.regex.Pattern;

public class Zadanie10 {
    public static void main(String[] args) {
        String regex = "^a.*b$";
        String input = "a_test_string_b";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy łańcuch pasuje do wzorca? " + matches);
    }
}
