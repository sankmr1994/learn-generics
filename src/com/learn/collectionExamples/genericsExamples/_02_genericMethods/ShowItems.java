package com.learn.collectionExamples.genericsExamples._02_genericMethods;

public class ShowItems {

    public <T> void showItem(T t) {
        System.out.println("Item is : " + t);

    }

    public <T> T getItem(T t) {
        return t;
    }

    public <K, V> void printKeyValue(K k, V v) {
        System.out.println("Key : " + k + " Value : " + v);
    }

    public <T> void printArray(T[] t) {
        for (T items : t) {
            System.out.println("Values : " + items);
        }
    }
}
