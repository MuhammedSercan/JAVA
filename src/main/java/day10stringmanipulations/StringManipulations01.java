package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydır.";

        boolean b = a.startsWith("va", 2);  // Bu String 2. Karakterden sonra ne ile başladıını buldu kod.
        System.out.println(b);

        String c = a.replaceFirst("a", "*"); // Stringteki ilk "a" karakterini , "*" a çevirir.
        System.out.println(c);                               // sadece replace("a", "*"); methodu olsaydı tüm "a" ları "*" a çevrilirdi.

        String d = a.concat("Anladın mı?");
        System.out.println(d);

        //concat() methodu 2 Stringi birbirine yapıştırmaya yarar. concat() sona ekler.

        // Concatenation işlemi iki türlü yapılabilir.
        //i) + ile  yani a + "Anladın mı?"; şeklinde   ii) concat() ile
        // Java bir işlem için method üretmiş ise, o methodu kullanmak best practice dir.

        String e="   Tom Hanks     ";
        String f = e.trim();
        System.out.println(f);
        //trim() methodu bir Stringin baş ve sonundaki space karakterlerini siler aradaki space karakterlerine dokunmaz.

        String h ="Java";
        String i ="Lava";
        int k = h.compareTo(i);
        System.out.println(k);

        //h.compareTo(i) iki Stringi alfabetik (lexicographic) olarak karşılaştır
        //büyük- küçük harfe duyarlıdır.
        //büyük- küçük harfe duyarlı olmasını istemezseniz compareToIgnorCase(i) kullanabilirsiniz
        //Bu kodda h nin alfabetik sırasından i nin alfabetik sırası çıkarılır

        String n = a.repeat(3);
        System.out.println(n);
        //repeat(5) methodu 5 kez tekrar eder.
        //repeat(0) empty String return eder.

        //Java Document ulaşmak için ctrl basılı tutup mouse ile method ismine tıklanılır.






    }
}
