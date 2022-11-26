package day28abstraction;

public interface Engine {
    /*
    1) Atomic olsun diye “parent”i parcaladim ama bir “Child Class” in birden fazla “parent” i oldu
    bu ise Java’da mumkun degildir. Cunku Java “multiple Inheritance” i desteklemez.

    “multiple inheritance” class’larda mumkun degildir fakat Java “interface” isimli yeni bir yapi olusturdu
    bu yapida “multiple inheritance” a musaade etti.

    2) Interfacedeki tüm methodlar abstract olduğu için interfacelere "fully abstraction" denir
    Abstract class larda abstract method ve concrate method bir arada kullanıldığı için abstract classlara fully abstraction denmez.
     */


    //interfacedeki tüm methodlar abstract olmak zorundadır.
    //interface lerde abstract method oluştururken, abstract keyword kullanmaya gerek yoktur.Java o methodun abstract olduğunu bilir.


    //interface lerdeki methodlar Java tarafından otomatik olarak public kabul edilir bu yüzden public yazmaya gerek yoktur.

    //public abstract void eco(); ile void eco(); aynı anlamdadır.
    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak, interfacelerin içinde bodysi olan methodlar üretebilirsiniz.Bu default access modifier değil keyword
    //Aşağıdaki method non-static methoddur.
    public default int add(int a, int b){
        return a+b;
    }

    //static keyword kullanarak da interfacelerin içinde body si olan methodlar üretebilirsiniz.
    //Aşağıdaki method static methoddur.
    public static String update(String str){
        return str + "!";
    }





}
