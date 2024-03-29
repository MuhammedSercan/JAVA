package day27exceptions;

public class Exceptions03 {

    /*
    1)Java kendi kurallarını Exceptionlar oluşturarak, Developerların Java kurallarına uymalarını temin etmiştir.
    2)Biz de Application üretirken kendi Exceptionlarımızı oluşturarak
    diğer develeporların bizim ortaya koyduğumuz kurallara uymalarını temin ederiz
    3)Javanın değil,bizim ürettiğimiz exceptionlara "custom exception" denir.
    4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
    5)Custom "RuntimeException" üretmek için "extends RuntimeException" deriz.
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz




     */



    public static void main(String[] args) throws IllegalGradeException {

        printGrades(120);
        checkNameFormat("Ali");

    }


    public static void printGrades(double grade) throws IllegalGradeException {

        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den çok olamaz");
        }else {
            System.out.println(grade);
        }
    }

    // Verilen ismin ilk harfinin büyük harf olmaması durumunda Exception atan method yazınız

    public static boolean checkNameFormat(String name){

        if(name.charAt(0)>='A'  && name.charAt(0)<= 'Z'){
            return true;
        }else{throw new IllegalNameException("İsimler büyük harfle başlamalıdır");
        }

    }


}
