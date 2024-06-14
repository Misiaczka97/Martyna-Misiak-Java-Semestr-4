import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamZipExample {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.add(firstIterator.next());
            builder.add(secondIterator.next());
        }
        return builder.build();
    }

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4");

        Stream<String> zipped = zip(stream1, stream2);
        zipped.forEach(System.out::println);
    }
}
