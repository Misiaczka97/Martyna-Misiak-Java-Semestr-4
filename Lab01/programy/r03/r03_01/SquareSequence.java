package r03.r03_01;

public class SquareSequence implements IntSequence
{
    public boolean hasNext()
    {
        return true;
    }

    public int next()
    {
        ++n;
        return n * n;
    }
    
    private int n = 0; // domyślnie równe 0
}

