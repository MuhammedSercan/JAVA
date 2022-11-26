package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ilk ismi ikinci ismini ve soy ismini alınız aşağıdaki formatta ekrana yazdırınız


         */

        Scanner input = new Scanner(System.in);
        System.out.println("İlk isminizi giriniz");
        String ilkIsim = input.next();// next() methodu kullanıcıdan string datası almak için kullanılır.

        System.out.println("ikinci isminizi Giriniz");
        String ikinciIsim = input.next();

        System.out.println("Soyisminizi Giriniz");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranızı giriniz");
        String kimlikNumara = input.next();

        System.out.println(ilkIsim +" "+ ikinciIsim +" "+ soyIsim);
        System.out.println(kimlikNumara);


        //2.Yol:

        System.out.println("İlk, orta ve soyisminizi ve kimlik numaranızı giriniz");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk +" "+ orta +" "+ soy);
        System.out.println(kimlik);

        //3.Yol:

        System.out.println("İlk, orta ve soyisminizi giriniz");
        String tam = input.nextLine();
        System.out.println(tam);






    }



}
