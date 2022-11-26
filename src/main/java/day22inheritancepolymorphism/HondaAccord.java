package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*

    1) Siz class oluşturduğunuzda, Java otomatik olarak size constructor verir,
    cünkü Java Class ın bir kalıp olduğunu ve Object oluşturmak için constructor in sart olduğunu bilir

    2)Javanın otomatik olarak oluşturduğu bu görünmez contructor a default constructor denir.

    3)Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java "default constructor" u siler.

    4)Bir Class ta birden fazla constructor olabilir. Fakat bu constructorların parametreleri farklı olmalıdır.

    5) this keyword bu class anlamındadır. "this.price" demek bu class daki "price" isimli variable demektir.
    this.price syntax i constructorların içinde kullanılır.

     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){
        this.price=price;
    }

    public HondaAccord(int price){
        this.price=price;
        this.year =year;
    }

    public HondaAccord(int price,int year){
        this.price=price;
        this.year =year;
        System.out.println("Honda Accord Constructor");

    }
    public HondaAccord(int price,int year,String make, String model){

        this.price=price;
        this.year =year;
        this.make = make;
        this.model=model;

    }


}
