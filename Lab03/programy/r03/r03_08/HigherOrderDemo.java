package r03.r03_08;

import java.util.Arrays;
import java.util.Comparator;

public class HigherOrderDemo
{
    public static Comparator<String> compareInDirecton(int direction)
    {
        return (x, y) -> direction * x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comp)
    {
        return (x, y) -> comp.compare(y, x);
    }

    public static void main(String[] args)
    {
        String[] words = { "Zuzia", "ma", "małego", "białego", "kotka" };
        System.out.println("\nUtworzona tablica:\n" + Arrays.toString(words));
        
        Arrays.sort(words);
        System.out.println("\nPosortowana tablica:\n" + Arrays.toString(words));
        
        Arrays.sort(words, compareInDirecton(-1));
        System.out.println("\nOdwrotnie posortowana tablica:\n" + Arrays.toString(words));
        
        Arrays.sort(words, String::compareToIgnoreCase);
        System.out.println("\nPosortowana tablica z ignorowaniem wielkości liter:\n" 
            + Arrays.toString(words));
        
        Arrays.sort(words, reverse(String::compareToIgnoreCase));
        System.out.println("\nOdwrotnie posortowana tablica z ignorowaniem wielkości liter:\n" 
            + Arrays.toString(words) + "\n");
    }
}

