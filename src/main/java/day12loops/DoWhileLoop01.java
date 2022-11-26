package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while-loop için loop body si içindeki kodun hiç çalıştırılmama ihtimali vardır.
        //zero execution mümkündür
        int i = 1;

        while(i<1){
            System.out.println("While loop");
            i++;
        }

        //do-while-loop body si içindeki kod her halükarda en az bir kere çalışır
        //zero execution mümkün değildir
        int k=1;

        do{
            System.out.println("While loop");
            k++;
        }while (k<1);

        //Example 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.

        double num=24.5673;
        System.out.println(num);

        //String.valueOf() methodu parantezin içine koyulan data nın tipini String yapar.
        String str = String.valueOf(num);
        System.out.println(str);

        //regex için nokta kullandığınızda onune "\\" koyunuz. Yani nokta "\\." şeklinde kullanılır.

        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;

        do{
            sum= sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while(decimalInt>0);
        System.out.println(sum);








    }
}
