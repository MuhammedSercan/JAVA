package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // Example 1: Kullanıcıdan bir sayı alınız, sayı 100den küçük ise ekrana "Kazandın!" yazdırınız.
        // Aksi halde ekrana "Kaybettin!" yazdırınız
        // Kullanıcı kazandıkça oyun devam etmeli

        Scanner input = new Scanner(System.in);
        int sayı =0;

        do{
            System.out.println("Bir Sayı Giriniz");
            sayı = input.nextInt();

            if(sayı<100){
                System.out.println("Kazandınız!");

            }
        }while(sayı<100);

        System.out.println("Kaybettiniz!");

        // Example 2:Kullanıcıdan ismini alınız ilk harfin büyük harf olup olmadığını kontrol ediniz



        do{
            System.out.println("Lütfen bir isim giriniz");
            char ilkHarf = input.next().charAt(0);


            if(ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("İsmi Başarıyla Girdiniz");
            }else{
                System.out.println("İsmi Yalnış Girdiğiniz için işleminiz iptal edilmiştir");
                break;
            }
        }while(true);

        //Infinite Loop:Sonsuz Döngü

        //Arttırma ve azalma kısmında hata yapılırsa veya o kısım yazılmazsa "infinite loop sorunsalı" oluşur.

        for(int i =1; i<4 ; i--){
            System.out.println("Hi!");
        }


        for(int i =1; i<4 ;    ){
            System.out.println("Hi!");
        }


        //While-loop ta arttırma ya da azaltma kısmı yazılmazsa "infinite loop sorunsalı" oluşur.
        int i= 12;

        while (i<15){
            System.out.println("Hi!");
        }








    }
}
