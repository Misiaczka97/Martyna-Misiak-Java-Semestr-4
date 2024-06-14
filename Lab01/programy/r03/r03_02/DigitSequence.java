package r03.r03_02;

public class DigitSequence implements IntSequence
{
    public DigitSequence(int number)
    {
        this.number = number;
    }

    public boolean hasNext()
    {
        return number != 0;
    }

    public int next()
    {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest()
    {
        return number;
    }
    
    private int number;
}

