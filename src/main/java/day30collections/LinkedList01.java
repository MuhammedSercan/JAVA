package day30collections;

import java.util.LinkedList;

public class LinkedList01 {


    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");

        System.out.println(names);

        String firstEl = names.peek();//İlk elemanı verir ama silmez. Boş listte kullanılınca null verir.

        System.out.println(firstEl);

        System.out.println(names);

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);

        String firstElement = names.poll();
        System.out.println(names);//ilk elemanı verir ve listten siler.


        String f = names.element();

        System.out.println(f);

        //Example 1: "A" ile başlayan tüm isimleri "*****" e çeviriniz.

        LinkedList<String> students = new LinkedList<>();

        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        for(String w : students){

            if(w.startsWith("A")){
                students.set(students.indexOf(w), "*****");
            }

        }

        System.out.println(students);

        //Example 2: Listteki 4 harften çok harf içeren isimleri siliniz

        for(int i =0; i<students.size(); i++){

            if(students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }

        System.out.println(students);



    }
}
