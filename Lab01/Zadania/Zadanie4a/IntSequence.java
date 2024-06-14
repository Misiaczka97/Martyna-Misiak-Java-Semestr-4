public interface IntSequence {
    boolean hasNext();
    int next();
}

class IntSequenceClass implements IntSequence {
    private int[] sequence;
    private int currentIndex = 0;

    public IntSequenceClass(int... values) {
        this.sequence = values;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sequence.length;
    }

    @Override
    public int next() {
        return sequence[currentIndex++];
    }

    public static IntSequenceClass of(int... values) {
        return new IntSequenceClass(values);
    }

    public static void main(String[] args) {
        IntSequenceClass sequence = IntSequenceClass.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.print(sequence.next() + " ");
        }
    }
}
