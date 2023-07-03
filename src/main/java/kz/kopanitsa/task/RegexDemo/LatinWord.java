package kz.kopanitsa.task.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatinWord {
    public static void main(String[] args) {
        String test = "One two three раз два три one1 two2 123 ";
        System.out.println(findLatinWord(test));
    }

    public static int findLatinWord(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
