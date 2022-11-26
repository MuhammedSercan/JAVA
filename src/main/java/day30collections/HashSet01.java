package day30collections;

import java.util.HashSet;

public class HashSet01 {

    // Hash bir tekniktir,birbirine benzemeyen code lar üretir, bu code lar datayı unique yapar.
    // Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
    // Has Set ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile zaman harcamadığından çok hızlı çalışır.
    // Hash Set ler index kullanmazlar, sıralama rastgele yapıldığı için index manalı olmaz.

    /*
    HashSetler:

        1)tekrarsiz elemanlarda
        2)sırlama onemli degilse
        3)hız cok önemliyse
        4)İndeks kullanmazlar
*/
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

        System.out.println(emails); //[Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //set lere var olan elemanları eklerseniz hata vermez bir öncekinin ÜSTÜNE tekrar yazar, (Overwrite)

        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]






    }


}
