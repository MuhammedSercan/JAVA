package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
    Method Overloading nasıl yapılır

    1) Method isimleri aynı olmalıdır.
    2) Method parametreleri farklı olmalıdır.
        i)parametre sayıları değiştirilebilir
        ii)parametre data type leri değiştirilebilir
        iii)Parametrelerin yerleri değiştirilebilir.(data type leri farklı ise)
    3) Method İsmi + Parametreler = Method Signature
    Not=Method Signature dışında ne değiştirirseniz değiştirin Java o methodları farklı kabul etmez

     */


    public static void main(String[] args) {

        add(3,5);
        add(3,5.0);



    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }







}
