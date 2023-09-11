package kz.kopanitsa.task.customiterator._main;

import kz.kopanitsa.task.customiterator.model.CustomIterator;

import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        Integer[] integerList = new Integer[] {1, 2, 2, 3, 5, 6, 7, 7, 7, 7, 7, 8};
        Integer predicate = 7;
        CustomIterator<Integer> customIterator2 = new CustomIterator<>(integerList, predicate);

        while (customIterator2.hasNext()) {
            Integer next = customIterator2.next();
            System.out.println(next);
        }

    }
}
