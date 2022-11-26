package day12loops;


import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //Example 1: 3 ten 10 a kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız

        for (int i =3; i<11 ; i++){
            System.out.print(i+" ");

        }

        System.out.println();
        //2. Yol

        int i =3;

        while(i<11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //Example 2: 17den 4e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yazınız

        int x = 17;

        while(x>3){
            if(x%2==0){
                System.out.print(x+ " ");

            }
            x--;
        }

        System.out.println();
        //Example 3: 12 den 67 e kadar sayıların toplamını veren kodu yazınız

        int sum=0;
        int y=12;

        while(y<68){

            sum= sum+y;

            y++;
        }
        System.out.println(sum);

        //Example 4: Size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız

        int sonuc =0;
        int sayı =385;

        while(sayı>0){
            sonuc=sonuc+sayı%10;

            sayı=sayı/10;
        }

        System.out.println(sonuc);

        //Example 5: Kullanıcıdan alldığınız bir sayının çarpım tablosunu ekrana yazdırınız
        // 3--> 3*1=3  3*2=6  3*3=9 .... 3*10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım Tablosunu Görmek İçin Lütfen pozitif bir tam sayı giriniz");
        int t= input.nextInt();

        int n=1;

        while(n<11){

            System.out.println(t + "x" + n + " = " + t*n);

            n++;

        }






    }
}
