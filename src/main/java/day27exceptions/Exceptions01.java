package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
       double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacters(null,"xy");
        System.out.println(r2);//2.0

        double r3 = compareNumOfCharacters("Selenium","");
        System.out.println(r3);//2.0

    }

    //Verilen 2 String'den 1 inin karakter sayısının diğerinin kaç katı olduğunu veren method oluşturunuz.
    public static double compareNumOfCharacters(String s,String t){
      double result =0;

       try{
           result = s.length()/t.length();
       }catch (NullPointerException e){
           System.out.println("length() methodu nıll ile kullanılamaz");
       }catch (ArithmeticException e){
           System.out.println("Herhangi bir sayı sfır ile bölünemez");
       }finally {
           System.out.println("Database ile connection kesildi");
       }
       return result;
    }



    //"final"  "finally"  "finalize"   açıklayınız...

    /*

    1)  "final" bir keyworddur. Variable,Class ve Method'lar için kullanılır...(eski notlara bkz.)
    2)  "finally" bir "code block" dur.
        "try-catch" veya sadece "try" ile kullanılır.
        "finally" code block içine yazılan code'lar her halukarda çalıştırılır.
        Mesela Database ile connection'u kesmek her halukarda yapılması gereken bir fiildir. Bunu "finally" ile yapabiliriz.
    3)  "finalize"  bir method' dur. Bu method Java tarafından data'lar imha edilmeden çağrılır.
        Bu method data'ları imha edilecek hale getirir ve daha sonra garbage collector bu dataları imha eder.

        "finalize" method'unu Java developerlar da çağırabilir ama Java kendi bildiğini yapar.



     */








}
