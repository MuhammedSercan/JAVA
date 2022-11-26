package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

    //Example 1: Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız?

        //1.yol: if

        int a = 12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif Değil");
        }

        //2.yol: ternary

        //             condition      ?      condition doğru ise uygulanacak kod      :       condition doğru değil ise uygulanacak kod
        String sonuc =    a>0         ?                "Pozitif"                      :              "Pozitif Değil";
        System.out.println(sonuc);


    //Example 2: iKİ SAYIDAN KÜÇÜK OLANI SEÇEN KODU YAZINIZ.

    int b = 12;
    int c = 23;

    int min =b<c ?  b  :  c;
        System.out.println(min);

        //Example 3: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız

        int d = -48;
        int mutlak = d<0 ? d* -1  : d;
        System.out.println(mutlak);

        //Example 4 : İki sayı aynı işaretli ise bu sayıları çarpınız. Farklı işaretli ise işlem yapamam mesajı veriniz.

        int x = 15;
        int y = 17;

        Object sonhal = (x>0 && y>0) || (x<0 && y<0) ? x*y  :  "İşlem Yapamam";
        System.out.println(sonhal);
        // Turnary farklı data tiplerinde Object ile farklı data türleri birlikte çalışıyor. int ,Stringer.
        // Note: Java'da her class'in en az bir tane "parent" class'i vardir.
        // Sadece "Object" class'in "parent" class'i yoktur.














    }


}
