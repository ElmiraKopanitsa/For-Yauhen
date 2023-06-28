package kz.kopanitsa.task.stringbiulder._main;

import kz.kopanitsa.task.stringbiulder.model.TestStringBuilder;

public class _Main {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 56;
        TestStringBuilder test = new TestStringBuilder();
        TestStringBuilder test2 = new TestStringBuilder(test.getSum(number1, number2));

        System.out.println(test.getSum(number1, number2));
        System.out.println(test.getSubtraction(number1, number2));
        System.out.println((test.getMultiplication(number1, number2)));
        System.out.println(test2.deleteChar(test2, "=", "равно"));
        System.out.println(test2.replaceText(test2, "=", "равно"));
    }
}
