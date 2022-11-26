package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Type Casting: Bir nümerik data type ni diğer nümerik data type ne çevirmek demektir.
    // byte<short<int<long<float<double
    // Auto widening     : küçükten büyüğe çevirme
    // Explicit Narrowing: büyükten küçüğe çevirme

    public static void main(String[] args) {

       byte age = 23; // psvm nin içinde olduğundan tekrar public yazınca hata verdi.

       int nexAge = age; // psvm nin içinde olduğundan tekrar public yazınca hata verdi.

       long population = 1234;

       int newPopulation = (int)population;

        //example1: shortu dobleye ceviren kodu yazınız.
        // floatı byte yapan kodu yazınız

        short kilo = 115;
        double newKilo = kilo;

        float abc = 18.95f;
        byte newAbc = (byte)abc;
        System.out.println(newAbc); // Java ondalık sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz.
        // Java ondalık sayıyı tam sayıya çevirirken ondalık kısmını siler

        int number = 515;

        byte newNumber = (byte)number;//3

        System.out.println(newNumber);

        //Java 515i 256ya böldü kalanı return etti. 256: byte daki tam sayıların sayısı

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum); // -2

        // 510 u 256 ya bölüyor, kalan 254 fakat byte nin içinde olmadığından 2 kez var sayıp kalanı -2 yazar.




    }



}
