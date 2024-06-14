package r08.r08_03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CodePointsDemo
{
    public static List<String> codePoints(String s)
    {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result;
    }

    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Podaj łańcuch znaków jako argument");
            System.exit(1);
        }
        String s = args[0];
        System.out.println("string: " + s + " has length " + s.length());
        byte[] bytes = s.getBytes();
        System.out.println("bytes[" + bytes.length + "]: " + Arrays.toString(s.getBytes()));
        List<String> letters = codePoints(s);
        System.out.println("letters: " + letters.toString());
    }
}

