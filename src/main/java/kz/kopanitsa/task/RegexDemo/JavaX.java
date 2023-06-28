package kz.kopanitsa.task.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaX {
    public static void main(String[] args) {
        getJava("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");

    }

    public static void getJava(String testString) {
        Pattern pattern = Pattern.compile("Java\\s*\\d{1,2}");
        Matcher matcher = pattern.matcher(testString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
