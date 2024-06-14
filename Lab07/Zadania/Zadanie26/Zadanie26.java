import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie26 {
    public static void main(String[] args) {
        String input = "/home/student/mójplik.txt";
        String regex = "^(.*/)?(?:$|(.+?)(?:(\\.[^.]*$)|$))";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String path = matcher.group(1);
            String filename = matcher.group(2);
            String extension = matcher.group(3);
            
            ArrayList<String> directories = new ArrayList<>();
            if (path != null) {
                for (String dir : path.split("/")) {
                    if (!dir.isEmpty()) {
                        directories.add(dir);
                    }
                }
            }
            
            System.out.println("Katalogi: " + directories);
            System.out.println("Nazwa pliku: " + filename);
            System.out.println("Rozszerzenie: " + extension);
        }
    }
}
