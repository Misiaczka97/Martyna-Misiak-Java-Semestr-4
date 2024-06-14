package r03.r03_04;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaDemo
{
    public static void main(String[] args)
    {
        String[] friends = new String[] { "Pioterek", "Paweł", "Marysia" };
        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));
        
        ArrayList<String> enemies = 
            new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        System.out.println(enemies);
        enemies.removeIf(elem -> elem == null);
        System.out.println(enemies);
    }
}

