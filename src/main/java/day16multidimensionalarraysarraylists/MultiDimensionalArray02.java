package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        // Bir multidimensional array deki en büyük ve en kucuk elemanın toplamını veren kodu yazınız

        int arr[][] = {{2,5,1},{83,75}};

        int maxElement = arr[0][0];
        int minElement = arr[0][0];
        for(int[] w : arr){

            for(int k : w){

                maxElement = Math.max(maxElement, k);
                minElement = Math.min(minElement, k);
            }

        }
        System.out.println(maxElement);
        System.out.println(minElement);

        System.out.println(maxElement + minElement);

    }
}
