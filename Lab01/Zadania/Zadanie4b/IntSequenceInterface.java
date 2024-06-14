public interface IntSequenceInterface {
    boolean hasNext();
    int next();

    static IntSequenceInterface of(int... values) {
        return new IntSequenceInterface() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < values.length;
            }

            @Override
            public int next() {
                return values[currentIndex++];
            }
        };
    }

    public static void main(String[] args) {
        IntSequenceInterface sequence = IntSequenceInterface.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.print(sequence.next() + " ");
        }
    }
}
