package day28abstraction;

public class Civic implements Engine,Ac,Hood{
    //Bir class ı bir interface nin child i yapmak için "implements" kullanırız.
    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi technology");
    }

    @Override
    public void digital() {
        System.out.println("uses digital AC");
    }

    @Override
    public void climate() {
        System.out.println("uses climate technology");
    }


    @Override
    public void steel() {
        System.out.println("hood is made by steel ");
    }
}
