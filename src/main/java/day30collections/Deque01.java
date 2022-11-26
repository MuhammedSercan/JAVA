package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
            Deque: Double Ended Queue manasındadır yani iki uçlu Queue demektir.
           FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiğinde kullanılır.

     */
    public static void main(String[] args) {

        Deque<String>furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);


        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck);







    }



}
