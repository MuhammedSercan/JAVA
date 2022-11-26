package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {
        // Object nasıl oluşturulur?
        // 1) Class ismini yazınız
        // 2) Objeye bir isim veriniz
        // 3) =
        // 4) new keywordunu kullan
        // 5) class ismi parantezle beraber yaz

        Car myHonda = new Car();


        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();

        // MethodCreation classindan objeect olusturduk
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

    }

    public void hareketEt(){
        System.out.println("Hondanın vitesi iyidir");

    }

    public void dur(){

        System.out.println("Honda güvenli durur");
    }



}
