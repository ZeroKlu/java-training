package d_packages.dj_regex;

/*
    Java does not have a built-in Regular Expression class, but we can import the java.util.regex
    package to work with regular expressions. The package includes the following classes:
    - Pattern Class - Defines a pattern (to be used in a search)
    - Matcher Class - Used to search for the pattern
    - PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // compile() flags:
        // - Pattern.CASE_INSENSITIVE (ignores case)
        // - Pattern.LITERAL (ignores special characters)
        // - Pattern.UNICODE_CASE (ignores case in extended Unicode)
        // Note the bitwise OR to combine multiple flags
        Pattern pattern = Pattern.compile("test", Pattern.CASE_INSENSITIVE | Pattern.LITERAL);
        Matcher matcher = pattern.matcher("OnBaseTestVM");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // Patterns
        // Expression	Description
        // [abc]	    Find one character from the options between the brackets
        // [^abc]	    Find one character NOT between the brackets
        // [0-9]	    Find one character from the range 0 to 9

        // Metacharacters
        // char	Description
        //  |	    Find a match for any one of the patterns separated by | as in: cat|dog|fish
        //  .	    Find just one instance of any character
        //  ^	    Finds a match as the beginning of a string as in: ^Hello
        //  $	    Finds a match at the end of the string as in: World$
        //  \d	    Find a digit
        //  \s	    Find a whitespace character
        //  \b	    Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
        //  \u0000	Find the Unicode character specified by the hexadecimal number xxxx

        // Quantifiers
        // Quantifier	Description
        // n+	        Matches any string that contains at least one n
        // n*	        Matches any string that contains zero or more occurrences of n
        // n?	        Matches any string that contains zero or one occurrences of n
        // n{x}	        Matches any string that contains a sequence of X n's
        // n{x,y}	    Matches any string that contains a sequence of X to Y n's
        // n{x,}	    Matches any string that contains a sequence of at least X n's

        String[] phones = {
            "(123) 456-7890",
            "(123) 456 7890",
            "123-456-7890",
            "123.456.7890",
            "1234567890",
            "123456789",
            "12345678900"
        };
        String p = "^\\(?\\d{3}\\)?[- \\.]?\\d{3}[- \\.]?\\d{4}$";
        pattern = Pattern.compile(p);
        for (String phone : phones) {
            matcher = pattern.matcher(phone);
            String state = matcher.find() ? "" : "not ";
            System.out.println("Phone match " + state + "found for [" + phone + "]");
        }
    }
}
