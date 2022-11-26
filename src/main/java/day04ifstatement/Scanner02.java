package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        /*
        Note: char veriableleri matematiksel işlemlerde kullanırsanız Java onların ASCII değerlerini kullanır,
        System.out.println('A'+'C'); ekrana AC yerine 132 yazdırır.

        Mote: Javada "+" sembolünün iki anlamı vardır; toplama işlevi ve birleştirme işlevi.
        Java "+" sembolünü görünce önce toplama yapmaya çalışır yapamazsa birleştirme işlemi(concatenation) yapmaya çalışır
        o da olmazsa hata verir.
         */
        //Kullanıcıdan ilk ve soy ismini alınız , ilk ve soy isminin ilk harflerini ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("İlk isminizi giriniz");
        char ilk = input.next().charAt(0);// ilk harf

        System.out.println("Soy isminizi giriniz");
        char son = input.next().charAt(0);

        System.out.println("" + ilk + son);

        //2.yol

        System.out.println("Tam isminizi Giriniz");
        String tamIsim = input.nextLine();//Ali Can
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);












    }









}
