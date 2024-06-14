package r08.r08_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class SimpleReductions
{
    public static void main(String[] args) throws IOException
    {
        String contents = Files.readString(Paths.get("zemsta.txt"));
        List<String> wordList = List.of(contents.split("\\PL+"));
        
        Optional<String> largest = wordList.stream().max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));
        
        boolean aWordStartsWithQ = 
            wordList.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("aWordStartsWithQ: " + aWordStartsWithQ);
        
        Optional<String> startsWithQ = 
            wordList.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("startsWithQ: " + startsWithQ.orElse("(None)"));
        // Uruchom program jeszcze raz by sprawdzić czy znajdzie inne słowo
    }
}

