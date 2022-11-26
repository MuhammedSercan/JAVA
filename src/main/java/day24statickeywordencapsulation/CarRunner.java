package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variablelere objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez.
        //static variablelere class ismi kullanarak ulaşılmalıdır.
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        // Static keyword: Class' a bağlanmış class elemanlarıdır.
        // Static class elemanları tüm objelerin ortak elemanıdır.(gökteki ay örneği)
        // Staticler üzerinde yapılan her değişiklik, bütün objeleri etkiler ve bütün objeler tarafından görünür.
        // Static class elemanlarına Class üzerinden ulaşılır. Bu tavsiye edilir, obje üzerinden ulaşmak uzun yoldur,kullanılmamalıdır.


    }
}
