package kz.kopanitsa.task.week7._main;

import kz.kopanitsa.task.week7.method.MethodForArray;

public class _Main {
    public static void main(String[] args) {
        int [] arr = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        MethodForArray methodArr = new MethodForArray();
        methodArr.printCountEvenNumbers(arr);
        methodArr.printCountOddNumbers(arr);
        methodArr.printCountSimpleNumbers(arr);
        methodArr.printSumNumbers(arr);
        methodArr.printOddIndexNumbersSubtractionEvenIndexNumber(arr);
        methodArr.printCountZeroNumbers(arr);
        int [] arr2 = new int[] {2, -3, 1, 1};
        int [] arr3 = methodArr.bubbleSort(arr2);
        for (int num : arr3) {
            System.out.print(num);
        }
    }
}
