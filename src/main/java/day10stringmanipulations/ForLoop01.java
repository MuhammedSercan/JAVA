package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 5 kez "Hi" yazdırınız.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarlı işler için "loop" kullanırız
        //4 Çeşit loop var
        //i) for-loop ii) while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kez "Hi" yazdırınız.

        //   başlangıç değeri     loop hangi şart altında çalışacak          Increment(arttırma) veya Decrement(azaltma)
        for(    int i =1    ;                 i<6                     ;             i++                            )
        {System.out.println("Hi");

        }

        //Example 3: 4ten 7ye kadar tüm tam sayıları ekrana yazdıran kodu yazınız

        for( int sayı1= 4   ;   sayı1<8     ;       sayı1=sayı1+1){
            System.out.print(sayı1+ " ");// + " " yapma sebebimiz boşluk olması yanyana


        }

        System.out.println();

        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int x = 14 ; x>4 ; x--){
            System.out.print(x+ " ");
        }
        System.out.println();
        //Example 5: 14 den 5 e kadar tum çift tamsayilari ekrana yazdiran kodu yaziniz

        for(int y = 14;  y>4;  y=y-2 ){
            System.out.print(y+ " ");
        }

        System.out.println();
        //2.yol

        for(int y = 14;  y>4;  y-- ){
            if(y%2==0){
                System.out.print(y + " ");
            }
        }
        System.out.println();
        //Example 6: 28den 157 e kadar tüm tek sayıları ekrana yazdıran kodu yazınız

        for(int a =28 ; a<158 ; a++){
            if(a%2==1) System.out.print(a+ " ");
        }

        System.out.println();

        //Example 7 : "Java" Stringini "J*a*v*a*" Stringine çeviren kodu yazınız

        String str = "Java";

        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //Example 8: Size verilen Stringte tekrarsız karakterleri ekrana yazdırınız

        String q = "Hellooo Ali";

       for(int i = 0 ; i<q.length() ; i++){

           char c = q.charAt(i);

           if(q.indexOf(c)==q.lastIndexOf(c)){
               System.out.println(c);

           }

       }


    }
}
