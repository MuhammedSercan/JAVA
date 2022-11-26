package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Example: Kullanıcıdan yaş değerini alan kodu yazınız ve yaşın hangi jenerasyonda olduğunu aşağıdaki tabloya göre yazdırınız
        // 0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("Geçerli yaş giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if (yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetiskin");
        }else{                                        // 0,4,5,12,13 ... gibi sınır değerleri ile yapılan test.
            System.out.println("Tanımlanmamıs evre");//Boundary Value Analyze Test(BVA)-Sınır Değerlerini Analiz Ederek Test Etme
        }







    }
}
