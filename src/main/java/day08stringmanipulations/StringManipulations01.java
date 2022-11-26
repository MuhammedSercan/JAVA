package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harflerini ekrana yazdırınız
        //ör: Ramazan--> Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim = input.next();
        //1.yol
        char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length()-1);

        System.out.println("" + ilkHarf + sonHarf);//Yazdığınız code sadece bazı durumlarda calısırsa o code a "Hard Coding"denir.
        //Yazdıgınız code her durum için calısırsa o code a "Dynamic Coding" denir.

        //2.yol

        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1,isim.length());
        System.out.println(ilk + son);


        //Example 2: Aşağıda verilen Stringdeki tüm hayvan isimlerini ekrana yazdırınız.
        // "Ben kedi, eşim tavuk, oğlum sever inek "

        String str = "Ben kedi, eşim tavuk, oğlum sever inek";
        String kedi = str.substring(4,8);//4 dahil 8 hariç
        String tavuk = str.substring(15,20);//15 dahil 20 hariç
        String inek = str.substring(34);//Bitişi yazmazsak sonuna kadar yazar.
        System.out.println(kedi+tavuk+inek);

        //substring() in iki kullanımı vardır.
        //i)substring(baslangıc indeksi, bitiş indeksi) Stringin herhangi bir yerinden bir parça almaya yarar
        //ii) substring(baslangı. indeksi) Stringin verilen index ten sonuna kadar almaya yarar

        //Example 3: İlk isim ve Soyisimi içeren isimlerden ilk ve soy isimlerin baş harflerini ekrana yazdırınız.
        //Ali CAN-->AC

        System.out.println("Lütfen isminizi ve soyadınızı giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);



    }


}
