import java.util.stream.IntStream;

public class CodePointsImproved {
    public static void main(String[] args) {
        String sentence = "Hello";
        IntStream.iterate(0, i -> i + 1)
                 .limit(sentence.length())
                 .map(sentence::codePointAt)
                 .forEach(cp -> System.out.println(Integer.toHexString(cp)));
    }
}
