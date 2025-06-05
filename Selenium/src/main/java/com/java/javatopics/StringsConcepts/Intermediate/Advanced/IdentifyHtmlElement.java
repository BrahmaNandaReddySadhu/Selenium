package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyHtmlElement {
    public static void main(String[] args) {

        /*

<	Matches the literal less-than character <
[^>]	Negated character class: match any character except >
[^>]+	Match one or more characters that are not >
>	Matches the literal greater-than character >
Entire <>	Together, this pattern matches any string that starts with < and ends with >, and has at least one character that is not > in between.
         */
        String input = "<html><body>Hello</body></html>";

        Pattern pattern = Pattern.compile("<[^>]+>");
        Matcher matcher  =pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
