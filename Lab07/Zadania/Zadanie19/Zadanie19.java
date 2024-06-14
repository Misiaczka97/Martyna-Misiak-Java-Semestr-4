import java.util.regex.Pattern;

public class Zadanie19 {
    public static void main(String[] args) {
        String regex = "^[A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż]+(?: [A-ZĄĆĘŁŃÓŚŹŻ][a-ząćęłńóśźż]+)*$";
        String input = "Częstochowa";

        boolean matches = Pattern.matches(regex, input);
        System.out.println("Czy nazwa miasta jest poprawna? " + matches);
    }
}
