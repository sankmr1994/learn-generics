package com.learn.collectionExamples.genericsExamples._05_wildcards;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
