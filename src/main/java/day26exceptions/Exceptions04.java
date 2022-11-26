package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        int age = -25;
        try{
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }


    }

    //Yaşı ekrana yazdıran bir method oluşturunuz.


    public static void printAge(int age){
        if(age<0) {
            throw new IllegalArgumentException("Yaş negatif olamaz");

        }
        System.out.println(age);
    }

}
