package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // Bir tane integer multidimensional array oluşturunuz
        // Bu array'deki tüm sayıların toplamını veren kodu yazınız
        // Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz
        // Array veya Collection varsa ama "index" kullanmak zorundaysanız o zaman "for-each-loop" çalışmaz,
        // "for-loop" veya "while-loop" veya "do-while-loop" kullanmalısınız

        int arr[][] = {{2,5,1},{32,75},{13,21,43,56}};

        int sum = 0;

        for(int[] w : arr){
            for(int k : w){

                sum = sum + k;
            }
        }
        System.out.println(sum);

        // Bir multidimensional array' i normal array'e çeviren kodu yazınız.

        int brr[][] = {{2,5,1},{32,75}};

        int toplam = 0;

        for(int[] w : brr){
            toplam = toplam + w.length;
        }
        System.out.println(toplam);  // multidimensional Arraydeki eleman sayısını bulunuz

        int idx = 0;
        int crr[] = new int[toplam];

        for(int[] w : brr){
            for(int k: w){
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));






    }
}
