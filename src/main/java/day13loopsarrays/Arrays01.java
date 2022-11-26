package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        Aynı data tipinde, çoklu datayı depolamak için Javanın oluşturduğu yapılar vardır.
        Bu yapılardan biri de "Array" lerdir.
        */

        //Array nasıl oluşturulur?
        int stdAges [] = new int[7]; // [0, 0, 0, 0, 0, 0, 0]

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array' lere elemanlar nasıl eklenir?

        stdAges[0] =12;
        stdAges[1] =11;
        stdAges[2] =13;
        stdAges[3] =14;
        stdAges[4] =10;
        stdAges[5] =12;
        stdAges[6] =12;

        System.out.println(Arrays.toString(stdAges));

        //Arrey' deki herhangi bir elamanı nasıl yazdırabiliriz?
        System.out.println(stdAges[4]);

        //Example 1: Arreydeki en küçük ve en büyük elemanı ekrana yazdırınız

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);
        //length() Stringlerde kullanılır , length Array' lerde kullanılır.

        //Example 2: stdAges içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız

        int sum = 0;
        for(int i = 0 ; i<stdAges.length; i++){
            sum = sum + stdAges[i];

        }
        System.out.println(sum);

        //2.Yol:While-loop

        int i = 0;
        int summ =0;

        while (i<stdAges.length){
            summ = summ + stdAges[i];
            i++;
        }
        System.out.println(summ);

        //3.Yol: Do-While-Loop

        int k =0;

        int s =0;

        do{

            s=s + stdAges[k];
            k++;
        }while(k<stdAges.length);

        System.out.println(s);

        //4.Yol: For-Each-Loop Array lerde ve Collections larda kullanılır.

        int t =0;

        for(int w :stdAges){
            t=t+w;
        }
        System.out.println(t);

        // Example 3: String bir array oluşturunuz
        // Bu array e 5 tane isim yerleştiriniz
        // Bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

        String stdNames[] = new String[5];
        stdNames[0] ="Ali";
        stdNames[1] ="Tom";
        stdNames[2] ="Veli";
        stdNames[3] ="Kemal";
        stdNames[4] ="Cem";

        int karakterSayılarıToplamı = 0;

        for(String w : stdNames){

           karakterSayılarıToplamı = karakterSayılarıToplamı + w.length();

        }
        System.out.println(karakterSayılarıToplamı);

        //Example 4  : Char bir array oluşturunuz
        // bu array e 5 eleman ekleyiniz
        // bu array deki sadece büyük harfleri yazdırınız

        char ch[] = {'A', 'c', 'D', 'k', 'm'};

        for(char w : ch){

            if(w>='A' && w<='Z'){
                System.out.print(w);

            }



        }


















    }
}
