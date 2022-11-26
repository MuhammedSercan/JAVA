package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example1: Toplama işlemi yapan, sayıları kullanıcıdan alan kodu yazınız.

        //1. Adım Scanner Classından obje oluştur

        Scanner input = new Scanner(System.in);

        //2. Kullanıcıya ne yapacağını söyle

        System.out.println("İlk Sayıyı Giriniz");
        double sayı1 = input.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz");
        double sayı2 = input.nextDouble();

        System.out.println(sayı1+sayı2);




    }







}
