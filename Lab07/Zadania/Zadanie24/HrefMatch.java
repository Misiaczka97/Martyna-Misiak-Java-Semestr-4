import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * This program displays all file names with .jpg extension found on a web page by matching a regular expression.
 * Start the program as <br>
 * java regex.HrefMatch URL
 * @version 1.04 2019-08-28
 * author Cay Horstmann
 */
public class HrefMatch
{
    public static void main(String[] args)
    {
        try {
            // get URL string from command line or use default
            String urlString;
            if (args.length > 0) {
                urlString = args[0];
            } else {
                urlString = "https://ujd.edu.pl/";
            }
            // read contents of URL
            InputStream in = URI.create(urlString).toURL().openStream();
            var input = new String(in.readAllBytes(), StandardCharsets.UTF_8);

            // search for all occurrences of pattern matching .jpg files
            String patternString = "\\b\\w+\\.jpg\\b";
            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
            pattern.matcher(input)
                .results()
                .map(MatchResult::group)
                .forEach(System.out::println);
        } catch (IOException | PatternSyntaxException e) {
            e.printStackTrace();
        }
    }
}
