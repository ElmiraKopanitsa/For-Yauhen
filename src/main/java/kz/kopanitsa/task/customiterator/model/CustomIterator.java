package kz.kopanitsa.task.customiterator.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator<T> implements Iterator<T> {
    private T[] elements;
    private T predicate;
    private int[] indexPredicateArray;
    private int indexPredicate = 0;
    private int count = 0;

    public CustomIterator(T[] elements, T predicate) {
        this.elements = elements;
        this.predicate = predicate;
        this.indexPredicateArray = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals(predicate)) {
                indexPredicateArray[count] = i;
                count++;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return indexPredicate < count;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in collection.");
        }
        T element = elements[indexPredicateArray[indexPredicate]];
        indexPredicate++;
        return element;
    }
}
