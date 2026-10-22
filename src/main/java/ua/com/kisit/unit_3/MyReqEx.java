package ua.com.kisit.unit_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReqEx {

    static void main() {

        String text = "I study Java";

        Pattern pattern = Pattern.compile("[ IJa-z]+");
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println( matcher.matches() ? "true" : "false" );

        /*
        [abc]
        [^abc]
        [a-z]
        [A-Z]
        [a-zA-Z0-9_] | \w
        [^a-zA-Z_] | \W
        [0-9] | \d
        [^0-9] | \D
        [\f \r \n \t] | \s
        [^\f \r \n \t] | \S
        [\.\,\- ]

        [..]+
        [..]*
        [..]{n,m}
        [..]{n,}
        [..]{n} - повтор n
        [..]? один раз або можуть бути відсутніми

         */

        String email = "vvvvdfg_123.sdfds123.dfSDf@kneu.edu.ua"; //[a-zA-Z]+[\\.\\w]+ @[\\.\\w]+ [a-z]{2,}

        String pattern1 = "[a-zA-Z]+[\\-\\.\\w]+@[\\.\\w]+[a-zA-Z]{2,}";

        Pattern pattern2 = Pattern.compile(pattern1);
        Matcher matcher1 = pattern2.matcher(email);

        System.out.println(matcher1.matches() ? "true" : "false");



        int abc = 15;  // "[\\d]+"
        float f = 12.5f; // "[\\d]+[\\.]?+[\\d]+
    }

}
