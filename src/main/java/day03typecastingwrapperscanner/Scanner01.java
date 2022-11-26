package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    // Scanner bir Java Class ıdır. Bu Class ı kullanabilmek için "import" etmek gerekir.
    // Scanner Class ı, Java nın util kütüphanesindedir.

    public static void main(String[] args) {

        // Kullanıcıdan data almak için yapılması gerekenler
        // 1- Scanner Classından object oluşturun
        Scanner input = new Scanner(System.in);

        //2- Kullanıcıya ne yapacağını söylememiz lazım
        System.out.println("Yaşınızı Giriniz");

        //3- Kullanıcıdan aldığınız datayı bir variable in içine koyun
        byte age = input.nextByte();

        System.out.println("Senin Yaşın" + age);
















    }







}
