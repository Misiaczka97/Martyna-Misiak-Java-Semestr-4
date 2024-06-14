import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestStringsFinder {
    public static void main(String[] args) throws Exception {
        // Wczytaj zawartość książki do jednego dużego ciągu znaków
        String content = new String(Files.readAllBytes(Paths.get("war_and_peace.txt")));
        String[] words = content.split("\\W+");

        // Mierzenie czasu wykonania dla strumienia szeregowego
        long startTime = System.currentTimeMillis();
        List<String> longestWordsSequential = Stream.of(words)
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .limit(500)
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Czas wykonania strumienia szeregowego: " + (endTime - startTime) + " ms");

        // Mierzenie czasu wykonania dla strumienia równoległego
        startTime = System.currentTimeMillis();
        List<String> longestWordsParallel = Stream.of(words)
                .parallel()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .limit(500)
                .collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println("Czas wykonania strumienia równoległego: " + (endTime - startTime) + " ms");
    }
}
