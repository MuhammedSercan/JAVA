package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

        //Arrays içine primitive data tipleri ve referance ler yerleştirilebilir.

    public static void main(String[] args) {

        String str [] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));

    //Example 1: String bir Array oluşturunuz ve "Tom" ve "Tom" dan önceki tüm elemanları ekrana yazdırınız

        String arr[] ={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : arr){
            System.out.print(w + " ");

            if(w.equals("Tom")){
                break;

            }

        }
        System.out.println();
        //Example 2:String bir Array oluşturup "Tom" ve "Jane" hariç tum elemanları ekrana yazdırınız

        String brr[] ={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : brr){

            if(w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();
        // Example 3: Kullanıcıile beraber bir Array oluşturunuz
        // Bir öğretmenin sınıfındaki öğrencilerin isimlerini application a yuklemesini saglayan kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();

        String names[] = new  String[numOfStd];

        System.out.println("Girişi sonlandırmak için Q harfine basınız.");

        for(int i =1; i<=numOfStd; i++){

            System.out.println("Lutfen " + i + ". ogrenci ilk ismini giriniz");


            String stdName =input.next();


            if(stdName.equalsIgnoreCase("Q")){
                break;

            }

            names[i-1] = stdName;

        }

        System.out.println(Arrays.toString(names));

















    }












}
