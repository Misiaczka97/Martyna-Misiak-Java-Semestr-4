package r03.r03_03;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo
{
    public static void main(String[] args)
    {
        String[] friends = { "Piotr", "Paweł", "Maria" };
        Arrays.sort(friends); // friends zawiera teraz ["Maria", "Paweł", "Piotr"]
        System.out.println(Arrays.toString(friends));

        friends = new String[] { "Pioterek", "Paweł", "Marysia" };
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String>
{
    public int compare(String first, String second)
    {
        return first.length() - second.length();
    }
}

