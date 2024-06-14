import java.math.BigInteger;

class SquareSequence implements Sequence<BigInteger> {
    private BigInteger current = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        current = current.add(BigInteger.ONE);
        return current.multiply(current);
    }

    public static void main(String[] args) {
        SquareSequence sequence = new SquareSequence();
        for (int i = 0; i < 10; i++) {
            System.out.print(sequence.next() + " ");
        }
    }
}
