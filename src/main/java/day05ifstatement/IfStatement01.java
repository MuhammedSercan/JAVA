package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan alınan sayının tek mi çift mi olduğunu ekrana yazan kod yazınız
        //1.yol
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz...");
        int s = input.nextInt();

        if (s % 2 == 0) {
            System.out.println("Çift Sayı");

        }
        // "!=" demek eşit değil demektir.

        if (s % 2 != 0) {
            System.out.println("Tek Sayı");
        }
        //2.Yol
        if(s%2 ==0){
            System.out.println("Çift Sayıdır");
        }else{
                System.out.println("Tek Sayı");
            }


    //Example 2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız.


        System.out.println("Bir Sayı Giriniz");
        double d = input.nextDouble();

        if(d>0){
            System.out.println("Pozitif");
        }else if(d==0){
            System.out.println("Nötr");
        }else{
            System.out.println("Negatif");
        }













    }





    }

