package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Verilen yılın "Leap Yıl" olup olmadığını kontrol eden kodu yazınız.
        i) yıl 100 e bölünürse 400e de bölünmelidir
        ii) yıl 100 e bölünmezse 4e bölünmelidir. Artık yıl olması için bunlardan birini sağlamalı.
         */

        int year = 1600;

        String chek = year%100==0  ? (year%400==0 ? "Leap year"  : "Leap year değil")  : (year%4==0 ? "Leap year" :"Leap year degil");
        System.out.println(chek);

        // Aşağıdaki kurallara göre password un geçerli olup olmadığını kontrol eden kodu yazınız.
        // i) 8 karakterden fazla veya 8 karakter karakter varsa ilk harfi i olmalıdır
        // ii) 8 karakterden az karakter varsa ilk harfi K olmalıdır

        String pwd = "i2a3ed54";
        // length() String deki karakterleri sayıp onu size veriyor.

    char ch = pwd.charAt(0);
    String gecerli = pwd.length()<8 ? (ch=='K' ? "Geçerli" : "Geçersiz") : (ch=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);







    }
}
