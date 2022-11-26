package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sıfırları en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        int original[ ] = {0, 2, 3, 0, 12, 0};

        int yeni[] = new int [original.length];

        int idx = 0;

        for(int i = 0; i<original.length; i++){

            if(original[i] != 0) {


                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        // Example 2: Bir Array in içinde herhangi bir elemanın olup olmadığını kontrol eden ve gösteren kodu yazınız.
        // [2, 1, 2, -3, 2] 2 yi sorsa -----> 2 elemanı var ve 3 kere tekrarlandı

        int arr [] = {2, 1, 2, -3, 2};

        int counter = 0;// "flag" : bazı durumların olup olmadığını kontrol için kullanılır.

        int eleman = 5;

        for (int w : arr){
            if(w==eleman){
                counter++;
            }

        }

        if(counter>0){
            System.out.println(eleman + " array'de " + counter + " defa var.");

        }else {
            System.out.println(eleman + " array' de yok.");
        }

        //Example 3: Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız
        // "Java kolaydır calısana, ne kolay ki calısmayana" ==> calısmayana

        String sentence = "Java kolaydır calısana, ne kolay ki calısmayana";

        sentence = sentence.replaceAll("\\p{Punct}" , "");
        String words []=sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);














    }

}
