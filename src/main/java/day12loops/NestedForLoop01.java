package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        //Aşağıdaki şekli ekrana yazdıran kodu yazınız
        // ****
        // ****
        // ****

        for(int i =1 ; i<4 ; i++){


            for(int k=1 ; k<5 ; k++){
                System.out.print("*");
            }

            System.out.println();

        }

        //Kullanıcıdan alınarak yapılan yukarıdaki soru

        Scanner input = new Scanner(System.in);
        System.out.println("Satır Sayısını Giriniz");
        int satir = input.nextInt();
        System.out.println("Sütun Sayısını Giriniz");
        int sutun = input.nextInt();

        System.out.println("Karakter Seçiniz");
        char ch = input.next().charAt(0);

        for(int i =1 ; i<=satir ; i++){

            for(int k=1 ; k<=sutun ; k++){
                System.out.print(ch);
            }

            System.out.println();

        }

        /*
        Aşağıdaki şekli çizen kodu yazınız
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
         */

            for (int i = 1 ; i<6 ; i++){
                for (int k=1; k<=i ; k++){
                    System.out.print(k+" ");

                }
                System.out.println();
            }


    //Example 3: Aşağıdaki şekli çizen kodu yaazınız
    /*
                * * * *
                * * *
                * *
                *

     */
        int row =4;

        for(int i = 1; i<=row ; i++){
            for(int k =row; k>=i; k-- ){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
