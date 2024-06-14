import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class CheckFilterInvocation {
    public static void main(String[] args) throws IOException {
        Path currentRelativePath = Paths.get("");
        String currentDir = currentRelativePath.toAbsolutePath().toString();

        Path filePath = Paths.get(currentDir, "alice.txt");

        if (!Files.exists(filePath)) {
            System.err.println("File not found: " + filePath.toAbsolutePath());
            return;
        }

        String contents = new String(Files.readAllBytes(filePath));
        long count = Arrays.stream(contents.split("\\PL+"))
                           .filter(w -> {
                               System.out.println("Filter: " + w);
                               return w.length() > 12;
                           })
                           .limit(5)
                           .count();
        System.out.println("Number of long words: " + count);
    }
}
