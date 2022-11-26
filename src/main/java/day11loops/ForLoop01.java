package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1: 3den 6 ya kadar tamsayıların toplamını bulan kodu yazınız

        int sum = 0;
        for(int i = 3; i<7 ; i++){
           sum = sum+i;
        }
        System.out.println(sum);

        //System.out.println(); loop un dışına yazılırsa sum in sadece son değerini ekrana yazdırır.
        //loop un içine yazılırsa her bir loop için sum in hangi değerleri aldığını yazdırır.

        //Example 2: 6 dan 3 e kadar tam sayıların çarpımını bulan kodu yazınız

        int mltp = 1;
        for(int x = 6; x>2  ;   x--){
            mltp = mltp*x;
        }
        System.out.println(mltp);

        //Example 3: Size verilen bir tamsayının sayının rakamları toplamını bulunuz

        int num =385;
        num = Math.abs(num);
        int sonuc = 0;

        for(int i =num; i>0 ; i=i/10){
            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);

        //Example 4: Size verilen bir Stringi ters çeviren kodu yazınız.

        String str = "Kaba";

        String ters = ""; //concatination yapacaksanız "" kullanın.

        for(int i = str.length()-1; i>=0; i--){
            char c = str.charAt(i);

            ters = ters+c;
        }

        System.out.println(ters);









    }
}
