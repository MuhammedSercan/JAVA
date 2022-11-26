package day18arraylistspassbyvalue;

public class Varargs01 {

    /*

    1)Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak isterseniz "Varargs" kullanmalısınız
    2)"varargs" arka tarafta Array kullanır bu yüzden varargslarla çalışırken arraylerle çalışıyor gibi davranabilirsiniz.
    3)varargs oluşturmak için"data tipi" ni yazıyoruz, ... koyup varargs adı yazılır."..."sağa ya da sola yaslı olabilir, yaslı olmayabilir.
    4)Bir methodda varargs ın yanında başka bir parametre kullanılabilir, varargs en sonda olmak kaydı ile.
    5)Bir methodda birden fazla varargs kullanılamaz. Aksi 4.kuralla çelişir.


     */

    public static void main(String[] args) {

        int r1 = topla(2,3);
        System.out.println(r1);

        int r2 = topla(2,3,4);
        System.out.println(r2);

        int r3 = topla(2,3,4,5,6,7,8,9);
        System.out.println(r3);


    }

    //İki sayının toplamını return eden bir method oluşturunuz

    public static int topla(int a, int b) {
        return a + b;
    }

    //Üç sayının toplamını return eden bir method oluşturunuz

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    //Dört sayının toplamını return eden bir method oluşturunuz

    public static int topla(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    //İstediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturalım.
    public static int topla(int... a) {

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }

        return sum;
        }




    }

