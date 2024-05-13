package com.learn.collectionExamples.genericsExamples._04_typeInference;

public class Bucket<T> {

    public T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "item=" + item +
                '}';
    }
}
