package day02methodcreation;

public class MethodCreation {


    public static void main(String[] args) {
     System.out.println(toplamaYap(1.2, 5));

     System.out.println(carpmaYap(2, 1.5, 6));

     System.out.println(islemYap(4,5,10));

        System.out.println(bolmeYap(859, 27.9));

System.out.println(dortSayiyiCarpBol(8, 17.54, 87.197, 33));


     //sout yazıp enter a basarsanız System.out.println() otomatik olarak yazılır.
        //ekrana birşey yazdırmak için iki tane kod var
        // i) System.out.println()
        // ii) System.out.print()
        // farkları yazdırıp alt satıra geçme ve yazdırıp aynı satırdan devam etmektir.
        //ln line nin kısaltılmışıdır, line,satır - sıra anlamına gelir. println yazdırıp alt satıra geçirir
    }
/*1)access modifier
 2)(static)sonra konuşacağız
 3) yaptığımız hareketin ne ürettiğini yazarız. Buna methodun return type denir
  fakat bazı methodlar hiçbir şey üretmezler. Ekrana birşey yazdırmak ya da bir tuşa tıklamak gibi...
  İşte methodunuz size yeni birşey üretmiyorsa void yazılır.
 4) methodun ismi
 5) ( ) sonra konuşacağız
 6) {  }  method body */


 // example1: Toplama işlemi yapan bir method oluştutunuz.

    public static double toplamaYap(double a, double b){return a+b;}

// example 2. 3 sayıyı birbiri ile çarpan bir method oluşturunuz

    // example 3: 3sayıdan ilk ikisini toplayıp 3. ile çarpan method oluşturup sonucu ekrana yazdırınız

    public static double islemYap(double a, double b, double c){return (a+b)*c;}

    public static double carpmaYap(double a, double b, double c){return a*b*c;}

    public static double bolmeYap(double a, double b){return a/b;}
public static double dortSayiyiCarpBol(double a, double b, double c, double d){return a*b*c/d;}





}
