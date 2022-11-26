package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        // Inheritance da variableler seçilirken data objenin data tipine bakar.
        // Öncelikle, istediğiniz variable yi Object in data tipi olan Class ta arar.
        // O Class da bulamazsa parent Class lara bakar.
        // Hiçbir Parent Class da bulamazsa hata verir.

        Cat cat1    = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);

        // Object oluştururken Object in data type i Child Class lardan seçilemez

        // Inheritance da methodlar seçilirken Java Constructor a bakar.
        // Öncelikle istediğiniz methodu Constructoru kullanan Class dan alır.
        // O Class da bulamazsa parent Class lara bakar.
        // Hiçbir Parent Class da method() u bulamazsa hata verir.


        Cat cat4 = new Cat();
        cat4.eat();
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();

        Animal cat6 = new Animal();
        cat6.eat();





    }
}
