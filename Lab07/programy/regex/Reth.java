package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

public class Reth
{
    public static void main(String[] args)
    {
        System.out.println("\nTen program jest przeznaczony do użycia w narzędziu jshell.");
        System.out.println("W tym celu należy zaimportować statycznie funkcję reth:");
        System.out.println("\njshell> import static regex.Reth.reth\n");
        System.out.println("Następnie należy wywołać funkcję reth podając jako");
        System.out.println("argument łańcuch znaków będący wyrażeniem regularnym.\n");
        System.out.println("Przykładowo:");
        String example = "\njshell> reth(\"\\\\b\\\\w+\\\\b\")\n";
        System.out.println(example);
    }

    public static void reth(String regex)
    {
        System.out.println("RE: " + regex);
        while (true) {
            Pattern pattern = null;
            try {
                pattern = Pattern.compile(regex);
            } catch (PatternSyntaxException exception) {
                System.out.printf("There is a problem" +
                    " with the regular expression!%n");
                System.out.printf("The pattern in question is: %s%n",
                    exception.getPattern());
                System.out.printf("The description is: %s%n",
                    exception.getDescription());
                System.out.printf("The message is: %s%n",
                    exception.getMessage());
                System.out.printf("The index is: %s%n",
                    exception.getIndex());
                return;
            }
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter input string to search (press <CTRL>+C to finish): ");
                String string = in.nextLine();
                if (string == null) {
                    System.out.println("\nNew regex needed.");
                    break;
                }
                Matcher matcher = pattern.matcher(string);
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("I found the text"
                        + " \"" + matcher.group() + "\""
                        + " starting at index " + matcher.start()
                        + " and ending at index " + matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("No match found.\n");
                }
            }
        }
    }
}
