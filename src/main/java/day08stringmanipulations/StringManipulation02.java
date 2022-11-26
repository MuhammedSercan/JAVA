package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example 1: Bir stringteki space hariç kaç karakter kullanıldığını gösteren kodu yazınız.
        // "Ali okula gitti."==> 14

        String str = "Ali okula gitti.";
        //replace() methodu bir Stringteki herhangi bir karakteri ya da karakterleri değiştirmek için kullanılır.
        int num = str.replace(" ", "").length();

        System.out.println(num);

        //Example 2: Bir Stringteki tum 'a' harflerini 'A' ya çeviriniz

        String s = "Ankara'nin tasına gozlerimin yasina bak";
        String sonHali = s.replace("a", "A");

        System.out.println(sonHali);

        //Example 3: Bir Stringteki "kara" kelimesinin yerine "*" koyunuz

        String t     = "Kara kara dusunme Ankara";
        String yeniT =t.replace("kara","*");

        //Example 4: Bir Stringteki tüm sayıları "*" a çeviriniz

        String stdId     = "AC202117004";
        String yeniStdId =stdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdId);

        /*
        Bir grup datayı ifade eden kodlara "Regex" denir. Regular Expression in kısaltılmış halidir.

        1- tüm rakamları ifade etmek için [0-9]
        2- tüm küçük harfler              [a-z]
        3- tüm büyük harfler              [A-Z]
        4- tüm harfler                    [a-zA-Z]
        5- sesli harfler                  [aeiouAEIOU]
        6- space                          [ ]
        7- tüm rakamlar ve tüm harfler    [0-9a-zA-Z]
        8- tüm noktalama işaretleri       [\\p{Punct}]

        1-Rakamlar haric tüm karakterler            [^0-9]
        2-Kucuk harfler haric tüm karakterler       [^a-z]
        3-Büyük harfler haric tum karakterler       [^A-Z]
        4-Tüm harfler haric tüm karakterler         [^a-zA-Z]
        5-Space hariç                               [^ ]

         */

        //Example 5: Verilen bir Stringte kullanılan noktalama işareti,rakamlar ve space karakteri hariç
        // tüm karakterlerin sayısını bulan kodu yazınız.

        String u = "Ali 13 yasında, dersem inanma!...";
        int sonuc = u.
        replaceAll("[0-9]","").
        replace(" ","").
        replaceAll("\\p{Punct}","").
        length();

        System.out.println(sonuc);

        //Example 6: Bir passwodun geçerli olup olmadığını aşağıdaki kurallara göre test eden kodu yazınız
        //i) Space hariç en az 8 karakter olmalı
        //ii) En az 1 sembol içermeli
        //iii) En az 1 rakam içermeli
        //iv) En az 1 buyuk içermeli
        //v) En az 1 kucuk harf içermeli

        String pwd = "B78c? K!m";

        //i) Space hariç en az 8 karakter olmalı

        boolean first = pwd.replace(" ","").length()>7;

        //ii) En az 1 sembol içermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;// sayı,harfler, spaceyi çıkarıp saydık

        //iii) En az 1 rakam içermeli

        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv) En az 1 buyuk harf içermeli

        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //v) En az 1 kucuk harf içermeli

        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli) {
            System.out.println("Passwordunuz Geçerlidir");
        }else{
            System.out.println("Passwordunuz Geçerli Değildir");
        }

        //Example 7: Bir Stringteki noktalama işaretleri HARİÇ karakter sayısını gösteren kodu yazınız

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";
        int number = cumle.replaceAll("[\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "Harika" yazdırın,aksi halde "normal" yazdırın.

        String v = "Alex";
        boolean baslangıc = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result = baslangıc && bitis ? "Harika" : "Normal";
        System.out.println(result);



    }
}
