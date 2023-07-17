package kz.kopanitsa.task.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerPalindrome {
    public static void main(String[] args) {
        String test = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        findIntegerPalindrome(test);
    }

    public static void findIntegerPalindrome(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (isPalindrome(matcher.group())) {
                System.out.println(matcher.group());
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
