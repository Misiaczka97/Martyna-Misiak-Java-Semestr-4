package r03.r03_02;

public interface IntSequence
{
    default boolean hasNext() 
    {
        return true;
    };
    int next();
    public static IntSequence digitsOf(int n)
    {
        return new DigitSequence(n);
    }
}

