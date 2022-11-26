package day29abstractioncollections;

public interface Engine extends Vehicle{

    // CHİLD                PARENT
    //Class       -->     İnterface == implements
    //Class       -->     Class     == extends
    //İnterface   -->     İnterface == extends
    //İnterface   -->     Class     == mümkün değil

    //YUKARIDA TİPLER AYNI OLUNCA "extends" FARKLI OLUNCA "implements" kullandık.

    //interface lerdeki tüm variableler otomatik olarak(default) "public" tir.
    //interface lerdeki tüm variableler otomatik olarak(default) "final" dir.
    //interface lerdeki tüm variableler otomatik olarak(default) "static" tir.

    public static final int price = 2000;

    double weight = 23.5;





    void run();






}
