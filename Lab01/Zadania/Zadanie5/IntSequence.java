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

    public static IntSequence constant(int value) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true; 
            }

            @Override
            public int next() {
                return value; 
            }
        };
    }

    public static void main(String[] args) {
        IntSequence constantSequence = IntSequenceClass.constant(1);

        int count = 0;
        while (count < 10) {
            System.out.print(constantSequence.next() + " ");
            count++;
        }
    }
}
