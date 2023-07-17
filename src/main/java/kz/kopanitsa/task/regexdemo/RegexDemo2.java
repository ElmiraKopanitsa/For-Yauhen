package kz.kopanitsa.task.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String text = "cab, ccab, cccab";
        Pattern pattern = Pattern.compile("c*ab");
        Pattern pattern1 = Pattern.compile(".*cab*");
        Matcher matcher = pattern.matcher(text);
        Matcher matcher1 = pattern1.matcher(text);
        boolean b = matcher.matches(); // выполняет полное сопоставление регулярного выражения со строкой
        boolean b1 = matcher1.matches(); // выполняет полное сопоставление регулярного выражения со строкой
        System.out.println(b);
        System.out.println(b1);
        while (matcher.find()) {
            System.out.println(matcher.group()); // вывод найденных совпадений
        }
    }
}