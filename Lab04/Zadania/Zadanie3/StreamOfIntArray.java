import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamOfIntArray {
    public static void main(String[] args) {
        int[] values = { 1, 4, 9, 16 };
        IntStream stream = Arrays.stream(values);
        stream.forEach(System.out::println);
    }
}

