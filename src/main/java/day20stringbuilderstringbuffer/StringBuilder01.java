package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
    1)StringBuilder Java' da bir Class dır.
    2)StringBuilder String oluşturmaya yarar.
    3)String Class varken niçin StringBuilder Class a ihtiyaç duyarız.
        Çünkü; String Class Immutable Class dır, ama biz bazen Mutable Stringlere ihtiyaç duyarız.
        StringBuilder bize Mutable String verir
    4)Immutable Classlarda var olan değer değiştirilemez.Siz var olan bir değerideğiştirmek istediğinizde ;
        i) Memory' de Yeni bir variable yeni değerle oluşturulur,
        ii) Eski variable nin pointer i yeni variable a döndürülür.
        iii) Eğer bir variableyi hiçbir pointer göstermiyorsa, o variable "Garbage Collector" tarafından silinir.

        "Mutable Class" larda var olan değer değiştirilebilir. Orjinal değer korunmaz.

     5)String Classların immutable yapısı securty için önemlidir.
        Aynı değere sahip birden fazla String olduğunda, Java bir tane container oluşturur ve aynı değere sahip Stringlerin bu containeri
        kullanmasını temin eder. Bu memory i korumak için iyidir. Ancak containerdeki değeri bir variable için değiştirdiğimizde,
        tüm variablelerin etkilenmesi tehlikesi vardır. Bu tehlikeden kurtulmak için Java Stringleri immutable yapmıştır.
        Fakat herhangi bir variable nin değerini değiştirmek için Java bir yol bulmuştur.
        Değiştirmek istediğiniz variable için yeni bir container oluşturur ve variablenin pointerini bu yeni variable a yönlendirir.
        Böylelikle hem değişim sağlanmış hem de diğerleri etkilenmemiş olur.

     */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";

        // String builder nasıl oluşturulur.


        //1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.Yol :
        StringBuilder strb2 = new StringBuilder();
            //Yol a
        System.out.println();
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);

            //Yol b
        strb2.append(" Larn").append(" Java earn").append(" money.");
        System.out.println(strb2);

        // StringBuilder' larda karakter sayısı nasıl bulunur?

        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        //Capacity asimlarında capacity var olanın iki katının iki fazlasına çıkar
        strb3.append("zaaa");
        int capacity = strb3.capacity();
        System.out.println(capacity);

        strb3.setCharAt(2,'r');// index 2 deki karakteri 'r' ye çevirir.
        System.out.println(strb3);

        strb3.delete(3,11);// substring gibi ; 3 dahil 11 hariç, delete yani siliyor.
        System.out.println(strb3);

        strb3.deleteCharAt(2);// yazılan indexteki karakteri siler
        System.out.println(strb3);

        strb3.reverse();// reverse() methodu StringBuilder i ters çevirir.
        System.out.println(strb3);
        // mutable lerde sadece method kullanmak orjinal değeri değişmek için yeterlidir.
        //Immutablelerde orjinal değeri değiştirmek için methodu kullanmak yeterli olmaz , "atama işlemi" yapmalısınız.

        //toString() methodu StringBuilderleri Stringe çevirir
        String stringStrb3 = strb3.toString(); //StringBuilderi String e çevirdik
        System.out.println(stringStrb3);

        StringBuilder strb4 = new StringBuilder(stringStrb3);// String i StringBuilder e çevirdik
        System.out.println(strb4);

        strb4.insert(3,"XXXXX");// İlk 3 karakteri atla, sonra  "XXXXX" Koy
        System.out.println(strb4);

        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);
        //3.KARAKTERden sonra,"KLMOPQRSTU" Stringinin İNDEX 5, 6, 7 deki karakterlerini yerleştirir. 5 dahil 8 hariç.


        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);

        //compareTo() methodu
        // i)StringBuilderler tamamen aynıysa 0 verir.
        // ii) "a" alfabetik sırada "b" den sonra geirse , pozitif olarak aradaki alfabetik sıralama farkını gösterir.
        // iii) "a" alfabetik sırada "b" den önce geirse , negatif olarak aradaki alfabetik sıralama farkını gösterir.




    }
}

