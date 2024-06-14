public class Zadanie27 {
    public static void main(String[] args) {
        String regex = "\\b((\\d3)(\\d3)(\\d4))|((\\d3)(\\d4))\\b";
        // Grupy: ((\d3)(\d3)(\d4)), (\d3), (\d3), (\d4), ((\d3)(\d4)), (\d3), (\d4)
        int groupCount = 7;  // wyrażenie zawiera 7 grup przechwytujących
        System.out.println("Liczba grup: " + groupCount);
    }
}
