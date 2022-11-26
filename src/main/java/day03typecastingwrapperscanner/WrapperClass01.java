package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
         Java primitivelere methodlar ekleyerek yeni bir yapı oluşturdu. bu yapıya "Wrapper Class" denir.

         Primitive       Wrapper
         byte      ==>    Byte
         short     ==>    Short
         **int     ==>    Integer
         long      ==>    Long
         float     ==>    Float
         double    ==>    Double
         boolean   ==>    Boolean
         **char    ==>    Character

         */

        byte primitiveByte = 12;// primitiveByte yazıp . koyduğunuzda hiç method göremezsiniz.
        // Çünkü primitiveler method içermez değer içerir.


        Byte wrapperByte = 12;
        // wrapperByte yazıp . koyduğunuzda bir çok method görürsünüz. Cünkü wrapper ler method içerir.

        //byte data tipinin en küçük ve en büyük değerlerini ekrana yazdırınız

        System.out.println(Byte.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);

        //Example 2: short , int, long data tiplerinin en büyük ve en küçük değerlerini ekrana yazdırınız

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //"primitiveler nasıl wrapper lara çevrilir" (Autoboxing)

        float f1 = 13.99F;
        Float wrapperf1 = f1; // Autoboxing

        //"wrapperler nasıl primitivelere çevrilir" (Unboxing)

        Character w1 = 's' ;
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafından otomatik olarak yazılır, ekstra kod yazmaya gerek yok.







    }




}
