package com.learn.collectionExamples.genericsExamples._03_genericsBoundedTypeParameter;

public class Client {

    public static void main(String[] args) {
        Calculate calculateMin = new Calculate();
        System.out.println("Min : " + calculateMin.getMin(5, 3));
        System.out.println("Min : " + calculateMin.getMin('c', 'b'));
        System.out.println("Min : " + calculateMin.getMin("sam", "san"));


        //Customize class compare
        Person mano = new Person("mano", 27);
        Person sam = new Person("sam", 30);
        System.out.println("Min age : " + calculateMin.getMin(mano, sam));

        Integer a = 10;
        Integer b = 20;
        Integer res = a + b;
        System.out.println(res);

        System.out.println("Add : " + calculateMin.add(a, b));
        System.out.println("Add : " + calculateMin.add(20, 1.5));

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("countGreaterItems : " + calculateMin.countGreaterItems(nums, 6));
        System.out.println("countGreaterItemsUsingComparable : " + calculateMin.countGreaterItemsUsingComparable(nums, 6));
    }
}
