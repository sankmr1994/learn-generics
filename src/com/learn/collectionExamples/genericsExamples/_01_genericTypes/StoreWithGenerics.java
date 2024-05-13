package com.learn.collectionExamples.genericsExamples._01_genericTypes;

public class StoreWithGenerics<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
