package com.learn.collectionExamples.genericsExamples._04_typeInference;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static List<Bucket> bucketList = new ArrayList<>();

    public static <T> void addItemInBucket(T item, List<Bucket<T>> itemBucket) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(item);
        itemBucket.add(bucket);
        bucketList.add(bucket);
        System.out.println("Item : " + item + " added to bucket.");
    }

    public static <T> void printKeyValue(T k, T v) {
        System.out.println("Type of k : " + k.getClass().getSimpleName());
        System.out.println("Type of v : " + v.getClass().getSimpleName());
        System.out.println("Key : " + k + " value : " + v);
    }

    public static void main(String[] args) {
        addItemInBucket("Dates", new ArrayList<>());
        addItemInBucket("Grapes", new ArrayList<>());
        System.out.println(bucketList);

        printKeyValue("sam", "kamal");
        printKeyValue("sam", 10);
        printKeyValue("sam", new Thread());
        printKeyValue(new Thread(), new Exception());

        Client.<String>printKeyValue("ram","kamal");
    }
}
