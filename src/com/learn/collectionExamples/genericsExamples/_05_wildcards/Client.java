package com.learn.collectionExamples.genericsExamples._05_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Client {

    public static void printWithWildCards(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void printWithoutWildCards(List<Object> list) {
        list.forEach(System.out::println);
    }


    // If our operation is only reading values from the list
    public static void upperBoundWildcards(List<? extends Number> numbers) {
        // numbers.add(40); // CE Because don't know which one Int,Double,Float
        for (Number number : numbers)
            System.out.println(number);
    }

    // If our operation is only adding values from the list
    public static void lowerBoundWildcards(List<? super Number> numbers) {
        numbers.add(10);
        numbers.add(1.9);
        numbers.add(1.5f);
        System.out.println(numbers);
    }


    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(2);
        list.add("sam");
        printWithoutWildCards(list);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(30);
        // printWithoutWildCards(integerList); // CE
        printWithWildCards(integerList);


        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        printWithWildCards(shapeList);

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle());
        printWithWildCards(rectangleList);

        //Upper Bound Wildcards
        upperBoundWildcards(Arrays.asList(1, 2, 3));
        upperBoundWildcards(Arrays.asList(1.0, 2.0, 3.0));

        //Lower Bound Wildcards
        lowerBoundWildcards(new ArrayList<>());
    }
}
