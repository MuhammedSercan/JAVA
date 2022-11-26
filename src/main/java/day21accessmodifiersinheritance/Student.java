package day21accessmodifiersinheritance;

public class Student {


        /*

        Access Modifiers

        1)public    2) protected    3) default (Access modifieri default yapmak için access modifier yazmayız)    4)private

        //ACCESS MODİFİER genişten dara doğru;
        public-->protected-->default-->private

        //ACCESS MODİFİER ları birer birer açıklayınız.
        public her class tan kullanılabilir
        protected olanlar başka packagelerden kullanılamaz. Ancak baska package'de child class içinden kullanılabilir.
        default olanlar başka package den kullanılamazlar
        Private olanlar sadece oluşturuldukları class içinde kullanılabilirler.

        //Protected ve Default farkını söyleyiniz

        protected olanlar başka packagelerden kullanılamaz. Ancak baska package'de child class içinden kullanılabilir.
        default olanlar başka package den kullanılamazlar

        //Class lar için hangi access modifiers kullanılabilir.

        public,default kullanılır. protected ve private kullanılamaz.

         */

        // public her class tan kullanılabilir
        public String stdName    = "TomHanks";

        // protected olanlar başka packagelerden kullanılamaz. Ancak baska package'de child class içinden kullanılabilir.
        protected String address = "Miami";

        //default olanlar başka package den kullanılamazlar
        String email             = "th@gmail.com";

        //Private olanlar sadece oluşturuldukları class içinde kullanılabilirler.
        private String stdId     = "202017004";







}
