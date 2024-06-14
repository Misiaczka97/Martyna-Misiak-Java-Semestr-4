import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public Integer next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    @Override
    public void remove() {
        // Metoda nie robi niczego
    }

    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(12345);
        while (sequence.hasNext()) {
            System.out.print(sequence.next() + " ");
        }
    }
}
