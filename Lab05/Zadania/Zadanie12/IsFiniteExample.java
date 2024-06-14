import java.util.stream.Stream;

public class IsFiniteExample {
    public static <T> boolean isFinite(Stream<T> stream) {
        try {
            stream.iterator().hasNext();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Is finite stream: " + isFinite(finiteStream));

        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
        System.out.println("Is infinite stream: " + isFinite(infiniteStream));
    }
}
