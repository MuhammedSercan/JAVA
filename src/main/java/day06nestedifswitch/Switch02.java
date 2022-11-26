package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız
         */

        //toLowerCase methodu bir stringteki tüm karakterleri küçük harfe çevirir.
        //toUpperCase methodu bir stringteki tüm karakterleri büyük harfe çevirir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayIsim = input.next().toLowerCase();

        switch(ayIsim){

            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayıs":
                System.out.println("mayıs");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylül":
                System.out.println("eylül");
            case "ekim":
                System.out.println("ekim");
            case "kasım":
                System.out.println("kasım");
            case "aralık":
                System.out.println("aralık");
                break;
            default:
                System.out.println("Geçerli gün ismi giriniz");



        }













    }

}
