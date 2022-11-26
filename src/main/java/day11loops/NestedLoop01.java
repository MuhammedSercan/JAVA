package day11loops;

public class NestedLoop01 {
    public static void main(String[] args) {
       /*
        1.Example:Aşağıdaki çıktıyı verecek kodu yazınız

        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....


 */

        for (int a = 1 ; a<4 ; a++){
            System.out.println("Week:   " + a);
            for (int b = 1 ; b<4 ; b++){
                System.out.println("Day : " + b);

            }

        }





    }
}
