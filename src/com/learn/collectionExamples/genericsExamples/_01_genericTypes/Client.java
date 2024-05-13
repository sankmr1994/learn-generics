package com.learn.collectionExamples.genericsExamples._01_genericTypes;

public class Client {

    public static void main(String[] args) {

        // With Generics
        StoreWithGenerics<Integer> storeWithGenerics1 = new StoreWithGenerics<>();
        storeWithGenerics1.setValue(45);
        int value1 = storeWithGenerics1.getValue();
        System.out.println("Value1 is : " + value1);

        StoreWithGenerics<String> storeWithGenerics2 = new StoreWithGenerics<>();
        storeWithGenerics2.setValue("sandy");
        String value2 = storeWithGenerics2.getValue();
        System.out.println("Value2 is : " + value2);

        // WithOut Generics
        StoreWithOutGenerics storeWithOutGenerics = new StoreWithOutGenerics();
        storeWithOutGenerics.setValue(45.5);
        int value3 = (int) storeWithOutGenerics.getValue();
        System.out.println("Value3 is : " + value3);

    }
}
