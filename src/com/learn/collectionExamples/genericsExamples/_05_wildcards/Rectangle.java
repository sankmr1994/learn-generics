package com.learn.collectionExamples.genericsExamples._05_wildcards;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }

}
