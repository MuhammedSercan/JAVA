package day09stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";
        int idxA1 = str.indexOf("a");
        System.out.println(idxA1);

        //indexOf() methodu verilen character veya characterlerin ilk görünümünün index ini verir.

        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);

        //lastIndexOf() verilen character veya characterlerin son görünümünü verir.

        String s = "Mississippi";

        int idxI= s.indexOf("iss");//indexOf() hem String hem de char ile kullanılabilir.
        System.out.println(idxI);
        //indexOf() ilk görünümünün ilk karakterinin indexini verir.
        //lastIndexOf() son görünümün ilk karakterini verir


        //Example 1: Bir String' deki bir characterin tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız.
        //"Helloooo"==> H->Tekrarsız e-->Tekrarsız  l--> tekrarlı

        String t = "Helloooo";
        char c   = 'o';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsız");
        }else{
            System.out.println("Tekrarlı");
        }

        String u = "Learn Java earn money";

        int sonuc = u.indexOf("n",5);
        System.out.println(sonuc);

        //indexOf() 2 parametre ile kullanılırsa
        // 2.parametrede verilen sayı kadar karakteri geçtikten sonra istenen karakterin ilk görünümünün index ini return eder.

        String abcd = "Hello Everyone";
        int xy= abcd.indexOf("e", 7);
        System.out.println(xy);

        //lastIndexOf() iki parametre ile kullanılırsa 2. parametrede verilen sayıyı index olarak kabul edip, en baştan bu indexe kadar
        //olan karakterleri bir kutu içine alınız ve lastIndexOf() methodunu sadece bu kutu içindeki String için kullanınız.

       String v = "Java is Java";
       boolean bosMu = v.isEmpty();
        System.out.println(bosMu);
        //isEmpty() methodu bir Stringin boş olup olmadığını kontrol eder, eğer Stringte hiç karakter yoksa true return eder,
        //herhangi bir karakter varsa, space dahil, false return eder.
        //isEmpty() true olması length()==0 olması demektir.

        String x = "";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //isBlank() hem boş String için hem de sadece space içeren Stringler için true return eder.





    }
}
