package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a2b";
        int r = convertStringToInteger(st);//NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'i
                                           //valueOf() kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.
        System.out.println(r+10);


    }

    public static int convertStringToInteger(String str){
        int i=0;

        try{
            // Herhangi bir satırda "Exception" atılırsa Java direkt "catch" bölümüne geçer, try içindeki sonraki kodları çalıştırmaz

            i= Integer.valueOf(str);
            System.out.println("Burası try bölümü");
        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakterler içeren Stringler integere çevrilemez");
        }
        return i;
    }





}
