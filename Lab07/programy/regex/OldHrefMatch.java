package regex;

import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.*;
import java.util.regex.*;

/**
 * This program displays all URLs in a web page by matching a regular expression that describes the
 * <a href=...> HTML tag. Start the program as <br>
 * java match.HrefMatch URL
 * @version 1.02 2016-07-14
 * @author Cay Horstmann
 */

public class OldHrefMatch
{
    public static void main(String[] args)
    {
        try {
            // get URL string from command line or use default
            String urlString;
            if (args.length > 0) {
                urlString = args[0];
            } else {
                urlString = "https://www.ujd.edu.pl";
            }
            // open reader for URL
            InputStreamReader in = new InputStreamReader(
                new URL(urlString).openStream(), 
                StandardCharsets.UTF_8
            );
            // read contents into string builder
            StringBuilder input = new StringBuilder();
            int ch;
            while ((ch = in.read()) != -1) {
                input.append((char) ch);
            }
            // search for all occurrences of pattern
            String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>";
            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String match = matcher.group();
                System.out.println(match);
            }
        } catch (IOException | PatternSyntaxException e) {
            e.printStackTrace();
        }
    }
}

