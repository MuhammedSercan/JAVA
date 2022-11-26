package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() Method : Bu methodu kullanarak bir elemanın Arreyde olup olmadığını anlarız
        //binarySearch() methodunu kullanmadan önce mutlaka "Arrays.sort()" kullanılmalıdır.
        //binarySearch() methodu aradığımız eleman Arrayde varsa o elemanın İNDEKSİNİ return eder.
        //binarySearch() methodu aradığınız eleman Array'de yoksa "-a" şeklinde negatif sayı alırsınız
        //Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir, "a" nin anlami olsaydi kacinci SIRADA olurdu demektir.
        //binarySearch() methodu tekrarlayan elemanlar için kullanılmaz.

        int arr [] = {12, 31, 43, 14};

        int sayı1 = 43;
        Arrays.sort(arr);
        int idx1 = Arrays.binarySearch(arr,sayı1);
        System.out.println(idx1);

        int sayı2 = 58;
        int sonuc = Arrays.binarySearch(arr,sayı2 );
        System.out.println(sonuc);// - 5 ---> "-" eleman yok demek ; "5" ise  olsaydı kaçıncı sırada olacaktı.(index değil SIRA)
































    }
}
