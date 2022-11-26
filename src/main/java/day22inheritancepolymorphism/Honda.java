package day22inheritancepolymorphism;

public class Honda extends  Car{

    public String color;
    public Honda(){
        super("beyaz",54000);
        System.out.println("Honda Constructor");
    }

    public Honda(String color){

        this.color=color;
    }


}
