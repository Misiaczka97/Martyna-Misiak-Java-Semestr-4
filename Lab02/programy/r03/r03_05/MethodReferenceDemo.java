package r03.r03_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MethodReferenceDemo
{
    public static void main(String[] args)
    {
        String[] strings = { "Ewa", "ma", "małego", "białego", "kotka" };
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        list.forEach(System.out::println);
        list.removeIf(Objects::isNull);
        list.forEach(System.out::println);
    }
}

