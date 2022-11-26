package day29abstractioncollections;

public class Civic implements Engine,Ac{

    /*

    "abstract" methodlar sadece ne yapılacağını söyler.(what to do)
    "concrete" methodla, ne yapılacağı ile birlikte nasıl yapılacağını da söyler.(how to do)

    "interface" ler bir yapılacak işler listesidir.(to do list)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız
    bu methodların return type leri aynı olmalıdır. Aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interfacelerden obje oluşturulamaz
    "abstract class" larda class oldukları için constructor vardır. Ama constructorlar abstract class larda obje oluşturamazlar.


    SORU : "Abstract Class" ile "Interface" nin farkları nelerdir?

  1) Method
   "Abstract Class" hem abstract hem de concrete method lar içerebilir
   "Interfaceler" ise sadece abstract methodlar içerir. Ama istersek default ve static keywords kullanarak concrete methodlar oluşturabiliriz.

  2)Variable
    "Abstract Class" larda normal Class lardaki gibi her türlü variable oluşturulabilir.
    "Interface"lerde ise variablelar public static ve final olmak zorundadır.

  3)Inheritance
    "Abstract Class" lar class oldukları için multiple inheritanceye müsaade etmezler.
    "Interface" ler ise multiple inheritance i desteklerler.

  4)Object Creation
    "Abstract Class" larda constructor vardır ama object oluşturmada kullanılmazlar.
    "Interface" lerde ise constructor olmadığından object oluşturulamaz.

  SORU: Object Oriented Programing Language Prensipleri nelerdir?

    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction





     */


    @Override
    public void run() {
        System.out.println("civic runs well");
    }




}
