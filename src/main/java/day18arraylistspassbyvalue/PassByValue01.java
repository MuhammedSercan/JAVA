package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
    1) Java variablelerin orjinal değerlerini korumak ister.
    2)variable methodlar içinde kullanıldığında , Java methodun içine orjinal değeri koymaz,
    o değerin kopyasını üretir ve method a kopyayı yollar.
    Method kopya üstünde değişiklik yapar dolayısıyla variable in orjinal değeri korunmuş olur.
    Bu sisteme "Pass By Value" denir.

    Java "Pass By Value" kullanır. Bazı programlama dilleri orjinal değeri koruma altına almamıştır. Bu işi developer lara bırakmıştır.
    Bu tarz programlama dilleri "Pass By Referance" kullanır. "Pass By Value" nin zıttı.
     */

    public static void main(String[] args) {

        int x =5;// gömlek
        System.out.println(x); //5
        //static method olan main method un içindeki hersey static olmalıdır.
        change(x);//öğrenci gömleği
        System.out.println(x);//gömlek

        int ucret =100;

        int copy = indirim(ucret);

        System.out.println(copy);//90

        System.out.println(ucret);//100
    }

    public static void change(int a){
        System.out.println(a*3);
    }
    // void dışındaki return tiplerinde method body si içinde return keyword kullanılmalıdır.
    public static int indirim (int gömlekUcreti){
        return gömlekUcreti - 10;

    }



}
