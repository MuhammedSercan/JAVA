package day25exception;

public class E01 {

    /*
    1) Exception(istisnai hata) javada kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır.
    2) Exceptionlar ile çalışmanın iki yolu vardır;
        a) try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme.
        b) throw exception kullanarak çalışmayı durdurma
        (mesela yazdığımız bir kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise ve bu dosyamız silinmiş ise java dosyayı bulamaz
        ve uygulamanın devam etmesi gerekmez)
    3) Eger exception ı handle etmez isek java çalışmayı durdurur.
    4) try-catch kullanırken try kodunu, bir ya da birden fazla catch ile birlikte kullanabiliriz, try kodu bir kez yazılıyor.
    5) try tek kullanılamaz
    6) Eğer yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyorsanız; try-catch block içine koymalısınız
    7) catch block parantezi içerisine, olması muhtemel exception class ismi yazılır.
    8) e.getmessage() , methodunu kullanarak teknik mesajlar elde edebilirsiniz.
       e.printStackTrace(); methodu Exception ile ilgili detaylıca teknik mesaj verir.
       System.err.println(); hata mesajını renkli olarak yazdırmamıza ve konsolda diğer mesajlardan ayırmamıza yarar.
    9) Eger try body içindeki kod sorunsuz çalışırsa catch block devreye girmez.





     */



    public static void main(String[] args) {
//        divide(6,2);
//        divide(0,2);
//        divide(6,0);// Matematikte bir sayı 0 ile bölünemez , haatanın sebebi bu.

        divide2(5,0);


    }


    //1.Yol tavsiye edilmez
    public static void divide (int a, int b){
        if(b==0){
            System.out.println("Bir sayı sıfır ile bölünemez");
        }else{
            System.out.println(a/b);
        }

    }
    // Yol try-catch kullanarak exceptionu handle etmek tavsiye edilir
    public static void divide2(int a,int b){

        try{
            System.out.println(a/b);
            System.out.println("hi exception");
            System.out.println("bye exception");
        }catch (ArithmeticException e){
            System.out.println("Bolme işleminde bir problem oluştu==>"+e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme işleminde bir problem oluştu");
        }

        //Java matematik ile ilgili karşılaşılması muhtemel tüm istisnaları, hataları AritmeticException class ına koymuştur.
        //Matematikteki tüm istisnaları detayları bilmek zorunda değiliz.


    }






}
