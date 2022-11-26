package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1 : Size verilen, pozitif ve negatif sayılar içeren bir integer array'deki
        // "en büyük negatif" ve "en küçük pozitif" elemanı bulunuz.

        int arr [] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);

        int mxNegative =arr[0];
        int mnPositive =arr[arr.length-1];

        for(int w : arr){
            if(w<0){
                mxNegative = Math.max(mxNegative, w);
            }
            if(w>0){
                mnPositive = Math.min(mnPositive, w);
            }

        }

        System.out.println(mxNegative+   "    and    "    +mnPositive);










    }
}
