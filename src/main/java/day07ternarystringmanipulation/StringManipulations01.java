package day07ternarystringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
                                            String Class Methodları

        1)equals()              : i)iki tane Stringin aynı olup olmadığını anlamamıza yarar.
                                ii) equals() methodu boolean return eder.

        2)equalsIgnoreCase()    : i) iki tane String'in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamamıza yarar
                                ii)equalsIgnoreCase() methodu boolean return eder.

        3)toLowerCase()         : i)Bir Stringteki tüm harfleri küçük harfe çevirmek için kullanılır
                                ii)toLowerCase() methodu String return eder.

        4)toUpperCase()         : i)Bir Stringteki tüm harfleri büyük harfe çevirmek için kullanılır
                                ii)toUpperCase() methodu String return eder.

        5)charAt()              :i)Bir String' den belli bir indexteki characteri almak için kullanılır.
                                ii)charAt() methodu char return eder.

        6)length()              :i)Bir String te kaç tane character kullanıldığını öğrenmek için kullanılır
                                ii)length() methodu int return eder.

        7)contains()            :i)Bir String'de belli bir characterin veya characterlerin var olup olmadığını anlamak için kullanılır.
                                ii) contains() method'u "boolean" return eder.

        8)split():              i)Bir String'i istediğimiz character'den parçalamaya yarar.
                                ii)split() method'u "Array" return eder.


         */



    //Bir passwordun geçerli olup olmadığını aşağıdakikurallara göre kontroleden kodu yazınız.
        //i)en az 8 karakter içermeli
        //ii) space karakteri içermemeli
        //iii)ilk harfi "M"  veya "m" olmalı
        //iv) son karakter soru işareti olmalı

        String pas = "Manisa12?";
        //i)
        boolean first = pas.length()>7;
        //ii)
        boolean second = !pas.contains(" ");  // ! manası "not"
        //iii)
        boolean third = pas.charAt(0)=='M' || pas.charAt(0)=='m';
        //iv)
        boolean fourth = pas.charAt(pas.length()-1)=='?';

        System.out.println(first && second && third && fourth);








    }

}
