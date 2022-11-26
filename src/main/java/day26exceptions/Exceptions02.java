package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);
        System.out.println(ch1);//v

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException : Eğer bir String ten karakter veya karakterler alırken olmayan bir index
        // kullanılırsa StringIndexOutOfBoundsException alınır.
    }

    public static char getCharFromString(String str, int idx) {
        char c = ' ';

        try {
            c = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("İndex ile ilgili bir problem oluştu" + e.getMessage());
            e.printStackTrace();//detaylı "log" için. "log"--> akışı takip etmek. Aplicationun adım adım neler yaptığını göstermektir.


        }
        return c;//Uygulamada return en son satırdır. Bundan sonra kod yazarsan hata alırsın.
    }


}