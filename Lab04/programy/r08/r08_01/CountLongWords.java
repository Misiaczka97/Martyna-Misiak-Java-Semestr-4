package r08.r08_01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords
{
    public static void main(String[] args) throws IOException
    {
        String treść = new String(
            Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8);
        
        List<String> słowa = Arrays.asList(treść.split("\\PL+"));
        long licznik = 0;
        for (String s : słowa) {
            if (s.length() > 12) {
                licznik++;
            }
        }
        System.out.println(licznik);

        licznik = słowa.stream().filter(w -> w.length() > 12).count();
        System.out.println(licznik);
        
        licznik = słowa.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(licznik);
    }
}
