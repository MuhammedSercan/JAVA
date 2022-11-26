package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Bir Stringteki "m" karakteri hariç tüm karakterleri yazdırınız

        String str = "Andromeda";

        for(int i =0 ; i<str.length();i++ ){

            char c = str.charAt(i);

            if(c!='m'){
                System.out.print(c);
            }

        }
        System.out.println();
        //2.Yol

        for(int i =0; i<str.length();i++){
            char c = str.charAt(i);
            if(c=='m'){continue;//bosveerr
            }
            System.out.print(c);
        }
        // loop un içinde bazı değerler için loopun çalışmamasını isterseniz continue kullanınız.

        //Example 2: 1 den 100 e kadar tüm tam sayıları ekrana yazdırınız. 6 ile bölünenler hariç

        for(int x=1; x<101 ; x++){

            if(x%6==0){
                continue;
            }
            System.out.print(x + " ");
        }
        System.out.println();
        //Example 3: Size verilen bir Stringteki 'm' den önceki karakterleri yazdırınız.

        String s = "Luxemburg";

        for(int i = 0; i<s.length();i++){

            char c = s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);

        }




    }
}
