package com.learn.collectionExamples.genericsExamples._03_genericsBoundedTypeParameter;

public class Calculate {

    public <T extends Comparable<T>> T getMin(T val1, T val2) {
        if (val1.compareTo(val2) < 0)
            return val1;
        return val2;
    }

    public <T extends Number> double add(T val1, T val2) {
        return val1.doubleValue() + val2.doubleValue();
    }

    public <T extends Number, K extends Number> int countGreaterItems(T[] t, K k) {
        int count = 0;
        for (T item : t) {
            double value = item.doubleValue();
            double check = k.doubleValue();
            if (value > check) {
                count++;
            }
        }
        return count;
    }

    public <T extends Comparable<T>> int countGreaterItemsUsingComparable(T[] t, T k) {
        int count = 0;
        for (T item : t) {
            if (item.compareTo(k) > 0) {
                count++;
            }
        }
        return count;
    }


}
