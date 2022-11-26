package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // switch de sadece int, byte, short, char ve String kullanılabilir.
        // eğer 3ten fazla durum varsa switch tercih edilebilir.

        //Kullanıcıdan islem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinesi yapınız.

        Scanner input = new Scanner(System.in);
        System.out.println("işlemi giriniz: +, -, *, /, %");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayıyı giriniz");
        double ilk = input.nextDouble();

        System.out.println("ikinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch(islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default :
                System.out.println("Bu işlem tanımlanmamıştır");

        }









    }
}
