package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        Aynı data tipine sahip birden fazla datayı depolamak için kullanılır.
        Array ile ArrayList in farkı nedir?

        1) Array oluştururken içine kaç eleman koymamız gerektiğini söylemeliyiz ve söylediğimizden fazla eleman koyamayız.
        Array'ler eleman sayısında "fixed" dirler.

        ArrayList' leri oluştururken eleman sayısı söylemeye gerek yok, cunku ArrayList' ler eleman sayısında "flexible"(esnek)dirler.

        2)Array'lerin içine "primitive" ve "reference"ler konabilir
        ArrayList'lerin içine ise sadece "non-primitive"ler konulur.

         3)Array' ler super fast tir, memory i cok az kullanır.
         NOTE: Eleman sayisi kesin belli olan coklu data'lari depolamak icin Array kullaniriz, ama
          eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almyin.
 */


        //ArrayList nasıl oluşturulur?
        //1.YOL
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.YOL
        ArrayList<Integer> heights = new ArrayList<>();
        //3.YOL
        List<Integer> nums = new ArrayList<Integer>();


        //ArrayList'ler nasıl yazdırılır?

        System.out.println(nums);


        //ArrayList'lere nasıl eleman eklenir?
        //add() her zaman elemanı en sona ekler

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);

        nums.add(1,50);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);
        System.out.println(prices);

        nums.addAll(2,prices);
        System.out.println(nums);

        //ArrayList'lerin eleman sayısı nasıl bulunur?
        int elemanSayısı = nums.size();
        System.out.println(elemanSayısı);


        //ArrayList' lerde herhangi bir eleman nasıl seçilir?
        //get() methodu istenen bir index'teki elemanı verir

        int el1 = nums.get(3);
        System.out.println(el1);

        //ArrayList'in bos olup olmadığını nasıl anlarız?
        boolean bos1 = nums.isEmpty();

        System.out.println(bos1);

        //ArrayList'de bir eleman nasıl degistirilir?

        nums.set(3,200);
        System.out.println(nums);

        //Example 1: nums ArrayList' indeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız?

        for(int w : nums){

            if(w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);

        //remove() methodunun içine tamsayı koyarsanız Java onu index olarak kabul eder.

        // Example 2: ArrayList'den 34 elemanınının ilk görünümünü siliniz
        // Tüm tam sayılar Java için aksi söylenmedikçe primitive dir. Yani int dir.
        // Primitive ler ArrayList lerin elemanı olamazlar.
        // primitive i wrapper class a cevirirseniz, non primitive olur ve non-primitiveler ArrayListlerin elemanı olur, index olamaz

        Integer sayı = 34;
        nums.remove(sayı);
        System.out.println(nums);




    }
}
