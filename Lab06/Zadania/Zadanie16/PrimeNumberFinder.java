import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        List<BigInteger> primes = Stream.iterate(BigInteger.TEN.pow(49), n -> n.add(BigInteger.ONE))
                                        .parallel()
                                        .filter(n -> n.isProbablePrime(100))
                                        .limit(500)
                                        .collect(Collectors.toList());

        primes.forEach(System.out::println);
    }
}
