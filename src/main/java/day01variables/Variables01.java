package day01variables;

public class Variables01 {
    // Variable nasil oluşturulur?
    // 1)Access Modifier  2)Data Type   3)Variable İsmi 4) =  5)Değer 6);
    // Javada ";" ingilizcedeki "." gibidir. Cümlenin bittiğini gösterir
    // ingilizcede cümle deriz, Javada "statement" deriz.
    // "=" sembolü "Assigment(Atama) Operator" olarak adlandırılır.
    // "=" sağdaki değeri alır soldaki variable in içine koyar

    public int age = 13;

    public int height = 183;

    // Javada Data Type'lari

    /*
                                        Primitive Data Types
    1) int: tam sayı . Javada tam sayıların sonu ve başı vardır. Matematikteki gibi sonsuz değildir.
    (32 bit kullanır)

    2) byte: tam sayılar için kullanılır. İnt ten farkı en küçük ve en büyüğünün -128 +127 olması, aralığının
    az olması.(8 bit kullanır)

    3) short: tam sayılar içindir. -32768 +32767 . boyutu int ile byte arası olan değerler için kullanılır.
    (16 bit kullanır)

    4) long:Tamsayılar için. İnteger in yetmediği yerde kullanılır. Cok daha küçük ve çok daha büyük tam sayılar
    için kullanılır.(64 bit kullanır)

    5)float: ondalıklı sayılar içindir. virgülden sonra 7 basamak içerebilir. sona "f" ya da "F" koymak gerekir.
    (32 bit kullanır)

    6)double: ondalıklı sayılar içindir. virgülden sonra 16 basamak içerebilir.(64 bit kullanır)

    7)boolean: true veya false değerleri için kullanılır.(1 bit kullanır)

    8) char : tek karekterler için kullanılır. ör: A, c,2, ?, _ (16 bit kullanır)
    Not: charlara değer verirken değeri tek tırnak arasına koyunuz, yoksa hata verir.

    Not: Java buyuk ve küçük harfe duyarlıdır. Java için true ile True farklıdır.

    NOT: Numeric Data Types : byte<short<int<long<float<double
        Numeric olmayan Data Types: boolean-char

                                            Non-Primitive Data Types
     String: isim, adres, kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
     String değerleri mutlaka " " arasına yazılmalıdır.
     String non-primitivedir. Yani size Java birçok method verir.

     primitive ile non-primitive farkı nedir
   1) non-primitive data tiplerinde değerin yanında methodlar vardır.
   Primitive data typlerinde ise sadece değer vardır, method yoktur.
   2) Primitive data tipleri java tarafından oluşturulmuştur, toplam 8 tanedir. Biz primitive data oluşturamayız.
   non-primitiveler java tarafından da oluşturulmuştur, biz de oluşturabiliriz.
   Non-primitiveler sayılamayacak kadar çoktur, çünkü her developer non-primitive data oluşturabilir.
   3)Primitive data type leri isimlendirilirken küçük harflerle başlarlar,
   Non-Primitive data type isimleri ise büyük harfle başlarlar.
   4) Primitive data type ler memoryde  farklı büyüklükte yer kaplarlar.
   Non-primitivelerin hepsi memoryde aynı büyüklükte yer kullanırlar.

     */

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;

    public double weightOfCell = 0.000012045;
    // Siz long demenize rağmen Java onu int kabul eder.
    // Bu yüzden long bir variable'a int aralığının dışında bir sayı verirseniz sonuna L veya l koyulmalıdır
    public long populationOfWorld = 7000000000L;

    // "L" Koymadığımız halde problem yok çünkü 1234 int aralığına uyar
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 's';

    public String name = "Tom Hanks";
// main method arabanın motoru gibidir. çalışmadan hiçbirşey çalışmaz.
    public static void main(String[] args) {

    }



}
