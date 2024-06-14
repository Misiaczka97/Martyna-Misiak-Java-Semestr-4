import java.util.ArrayList;

public class Zadanie25b {
    public static void main(String[] args) {
        String input = "123 -456 789";
        ArrayList<Integer> numbers = new ArrayList<>();

        String[] tokens = input.split("[^\\d-]+");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                numbers.add(Integer.parseInt(token));
            }
        }

        System.out.println("Znalezione liczby: " + numbers);
    }
}
