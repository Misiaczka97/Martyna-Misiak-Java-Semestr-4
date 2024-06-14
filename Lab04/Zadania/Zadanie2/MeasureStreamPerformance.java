import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class MeasureStreamPerformance {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice.txt")));
        String[] words = contents.split("\\PL+");

        long start = System.currentTimeMillis();
        long count = Arrays.stream(words).filter(w -> w.length() > 12).count();
        long end = System.currentTimeMillis();
        System.out.println("Sequential: " + (end - start) + " ms, Count: " + count);

        start = System.currentTimeMillis();
        count = Arrays.stream(words).parallel().filter(w -> w.length() > 12).count();
        end = System.currentTimeMillis();
        System.out.println("Parallel: " + (end - start) + " ms, Count: " + count);
    }
}
