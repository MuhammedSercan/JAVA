package day28abstraction;

public abstract class Animal {

    //Body si olmayan methodlar abstract method olarak adlandırılır.
    //Bir methodu abstract yapmak için i)method body i sil ii)abstract keyword kullan
    //"abstract methodlar" "abstract class" içinde olmalıdırlar.

    public abstract void eat();

    //Abstract class larda hem abstract methodlar hem de concrete methodlar kullanılabilir.
    public void drink(){
        System.out.println("Animals drink");
    }


    //abstract "move" method oluşturun

    public abstract void move();

















}
