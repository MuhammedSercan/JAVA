package day25exception;

public class E03 {

    public static void main(String[] args) {
        String str="Ali";
        getNumOfChars(str);

        String s = "";
        getNumOfChars(s);

        String t = null;
        getNumOfChars(t);
        //eger length() methodunda null kullanırsanız bu exceptionu alırsınız
    }
    //Bir Stringte bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz.
    public static void getNumOfChars(String str){
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("length() methodunda bir problem oluştu ");
            e.printStackTrace();
            
        }

    }


}
