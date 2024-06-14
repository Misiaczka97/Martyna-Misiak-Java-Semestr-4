/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 * Modified in 2022 by Andrzej Zbrzezny.
*/ 

package regex;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

public class RegexTesting
{
    public static void main(String[] args)
    {
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {
            String regex = console.readLine("%nEnter your regex (press <CTRL>+D to finish): ");
            if (regex == null) {
                console.format("%n%s%n", "Program finished.");
                System.exit(2);
            }
            Pattern pattern = null;
            try {
                pattern = Pattern.compile(regex);
            } catch (PatternSyntaxException exception) {
                console.format("%s%n", exception.getDescription());
                continue;
            }
            while (true) {
                String string = console.readLine("Enter input string to search (press <CTRL>+D to finish): ");
                if (string == null) {
                    console.format("%n%s%n", "New regex needed.");
                    break;
                }
                Matcher matcher = pattern.matcher(string);
                boolean found = false;
                while (matcher.find()) {
                    console.format("I found the text" +
                                   " \"%s\" starting at " +
                                   "index %d and ending at index %d.%n",
                                   matcher.group(),
                                   matcher.start(),
                                   matcher.end());
                    found = true;
                }
                if (!found) {
                    console.format("No match found.%n");
                }
            }
        }
    }
}
