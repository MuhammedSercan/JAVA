package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        // İki String in birbirine eşit olup olmadığını anlamak için "==" değil "equals" kullanılır
        // İki String in birbirine eşit olup olmadığını anlamak için; iki method kollanılabilir
        // i) equals()--> büyük küçük harfi önemser  ii) equalsIgnoreCase()--> Buyuk küçük harfi önemsemez


        //Example 1: Kullanıcıdan gün isimlerini alınız o günün hafta sonu mu hafta içi mi olduğunu kullanıcıya söyleyiniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir Gün İsmi Giriniz");
        String gun = input.next();
//1.yol
        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta Sonu");
        }else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta İçi");
        }else if(gun.equalsIgnoreCase("Salı")){
            System.out.println("Hafta İçi");
        }else if(gun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Hafta İçi");
        }else if(gun.equalsIgnoreCase("Perşembe")){
            System.out.println("Hafta İçi");
        }else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta İçi");
        }else {
            System.out.println("Geçerli Bir Gün İsmi Giriniz.");
        }
//2.yol

        if(gun.equalsIgnoreCase("Pazar")|| gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        }else if(gun.equalsIgnoreCase("Pazartesi")||
                 gun.equalsIgnoreCase("Salı") ||
                 gun.equalsIgnoreCase("Çarşamba")||
                 gun.equalsIgnoreCase("Perşembe") ||
                 gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta İçi");
        }else{
            System.out.println("Geçerli bir gün giriniz");

        }



        //3.yol
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar")    || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci  = gun.equalsIgnoreCase("Pazartesi")||
                            gun.equalsIgnoreCase("Salı")     ||
                            gun.equalsIgnoreCase("Çarşamba") ||
                            gun.equalsIgnoreCase("Perşembe") ||
                            gun.equalsIgnoreCase("Cuma");
        if(haftaSonu){
            System.out.println("Haftasonu");
        }else if(haftaIci){
            System.out.println("Hafta İçi");
        }else{
            System.out.println("Geçerli bir gün giriniz");

        }





        }



    }

