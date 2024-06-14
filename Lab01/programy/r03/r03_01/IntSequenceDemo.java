package r03.r03_01;

public class IntSequenceDemo
{
    public static void main(String[] args)
    {
        IntSequence squares = new SquareSequence();
        // SquareSequence squares = new SquareSequence(); // tak też można
        double avg = average(squares, 100);
        System.out.println("Średnia pierwszych 100 kwadratów: " + avg);

        IntSequence digits = new DigitSequence(1729);
        while (digits.hasNext()) {
            System.out.print(digits.next() + " ");
        }
        System.out.println();

        digits = new DigitSequence(1729);
        avg = average(digits, 100);
        // Będzie brało tylko cztery pierwsze wartości ciągu
        System.out.println("Średnia cyfr: " + avg);
    }
    
    public static double average(IntSequence seq, int n)
    {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            ++count;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }
}

