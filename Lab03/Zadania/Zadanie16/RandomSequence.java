import java.util.Random;
import java.util.stream.IntStream;

public class RandomSequence {
    public static IntStream randomInts(int low, int high) {
        Random random = new Random();
        return IntStream.generate(() -> low + random.nextInt(high - low + 1));
    }

    public static void main(String[] args) {
        IntStream randomNumbers = randomInts(5, 15).limit(10);
        randomNumbers.forEach(System.out::println);
    }
}
