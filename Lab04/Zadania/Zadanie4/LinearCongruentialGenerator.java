import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static Stream<Long> randomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        randomStream(25214903917L, 11, 248, 1).limit(10).forEach(System.out::println);
    }
}
