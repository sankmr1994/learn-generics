package com.learn.collectionExamples.genericsExamples._02_genericMethods;

public class Client {

    public static void main(String[] args) {

        ShowItems showItems = new ShowItems();
        showItems.showItem("sandy");
        showItems.showItem('a');
        showItems.showItem(2);
        showItems.showItem(4.5);


        System.out.println("Get item is : " + showItems.getItem("ram"));
        System.out.println("Get item is : " + showItems.getItem(16));
        System.out.println("Get item is : " + showItems.getItem(0.9));


        showItems.printKeyValue("san", "kmr");
        showItems.printKeyValue(4, 4.88);
        showItems.printKeyValue('A', "demo");

        Integer[] arr = {1, 2, 3, 4};
        showItems.printArray(arr);

        String[] stringArr = {"ram","san","kamal"};
        showItems.printArray(stringArr);

    }
}
