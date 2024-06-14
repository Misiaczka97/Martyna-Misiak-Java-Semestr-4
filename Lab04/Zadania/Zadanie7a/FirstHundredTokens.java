import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FirstHundredTokens {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")));
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        words.stream()
             .filter(w -> w.codePoints().allMatch(Character::isAlphabetic))
             .limit(100)
             .forEach(System.out::println);
    }
}
