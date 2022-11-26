package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        // If it rains I will cancel the picnic
        //   (şart)            (sonuç)
        //   true     ==>       active
        //   false    ==>       deactive
        // If statement belli kodları belli şartlara baglı olarak çalıştırmaya yarar.

        //Example 1: Sayı pozitif ise ekrana pozitif yazdırın.

        int s = 12;
        if (s > 0) {
            System.out.println("pozitif");

        }

        //Example 2: Verilen karakter büyük harf ise ekrana "büyük harf" yazdırın

        char h = 'A';

        if (h >= 'A' && h <= 'Z') {

            System.out.println("Büyük Harf");

        }

        // Note: && İŞLEMİ sadece boolean ile kullanılır.

        /*

        true  && true  = true
        true  && false = false
        false && true  = false
        false && false = false

        */

        //Example 3: Verilen bir sayı 3 basamaklı ise ekrana "üç basamaklı yazdırınız"

        int a = -123;

        a = Math.abs(a);

        if (a <= 999 && a>= 100){
            System.out.println("ÜÇ BASAMAKLI");
        }
// a>99 a<1000 Javayı daha az yorar ve bu tavsiye edilir.


        //Example 4: Verilen bir sayı çift sayı ise ekrana çift sayı yazdırınız.

        int x = 120;
        x = Math.abs(x);

        if (x%2==0){
            System.out.println("Çift Sayı");


            }


  // Javada = atama operatörüdür eşittir anlamına gelmez. Matematikteki = Javada == olarak yazılır.



        //Example 5: Verilen bir sayı 300 den küçük veya 1200 den büyük ise ekrana "Harika sayı" yazdırın

        int r = 125;

        if(r<300 || r>1200){
            System.out.println("Harika Sayı");
        }

        // || veya sadece booleanlar ile kullanılır
        // true  || true  = true
        // true  || false = true
        // false || true  = true
        // false || false = false


    }
}