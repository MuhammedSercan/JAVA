package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan ve çevresini hesaplayan kodu yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin Kısa Kenarını Giriniz");
        int en = input.nextInt();

        System.out.println("Dikdörtgenin Uzun Kenarını Giriniz");
        int boy = input.nextInt();

        System.out.println("Alan " + en*boy);
        System.out.println("Çevre " + 2*(en+boy));






    }



}
