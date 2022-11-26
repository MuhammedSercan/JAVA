package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
    1)Map'ler key-value structure kullanir
    2)Key'ler unique'dir
    3)Value'lar tekrarli data icerebilir
    4)Map'lerde eleman degil EntrySet kullaniriz.
    5)Key'lerde null tekrarsız olarak kullanılır
    6)Value'lar null kabul eder.
    7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
    8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.
    */
    public static void main(String[] args) {


        HashMap<String,Integer> studentAges = new HashMap<>();

        studentAges.put("Ali" , 13);
        studentAges.put("Tom" , 21);
        studentAges.put("Brad" , 12);
        studentAges.put("Ajda" , 76);
        studentAges.put("Cüneyt" , 75);
        studentAges.put(null , 55);

        studentAges.put("Ayhan Isık" , null);
        studentAges.put("Sadri Alışık" , null);

        studentAges.put(null , 66);
        studentAges.put("Ali" , 88);//Aynı key değerini tekrar kullandığınızda hata vermez, üstüne yazar(override)


        System.out.println(studentAges);//{Tom=21, Ajda=76, Brad=12, Cüneyt=75, Ali=13}

        //Map ten sadece keyler nasıl alınır.

        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Tom, Ayhan Isık, Ajda, Brad, Cüneyt, Ali, Sadri Alışık]

        //Map ten sadece value lar nasıl alınır

        Collection<Integer>values = studentAges.values();
        System.out.println(values);//[66, 21, null, 76, 12, 75, 88, null]

        //Belli bir keye ait value nasıl alınır.

        Integer cüneytAge = studentAges.get("Cüneyt");
        System.out.println(cüneytAge);//75

        //Example 1 : Tüm Integer yaşların ortalamasını hesaplayan kodu yazınız


        Collection<Integer> ages = studentAges.values();

        Integer sum =0;
        int counter =0;

        for(Integer w: ages){
            if(w!=null){
                sum=sum +w;
                counter++;
            }
        }

        System.out.println("Ortalama yaş :" + (sum/counter));//Ortalama yaş :56


        //Example 2: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız.


        Set<String> names = studentAges.keySet();


        int sum1 = 0;

        for (String w : names){

            if(w!=null && w.startsWith("A") ){
                sum1=sum1 + w.length();
            }

        }

        System.out.println(sum1);


        //key-->"Ajda" ve value-->76 olan EntrySet i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda",76);
        System.out.println(result);//true ---> siliyor ve silip silmediğini söylüyor.

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);// sidim value si 66 idi sildiğimin.

        //Key varsa value yi ver, yoksa bir mesaj ver.

        Integer result2 = studentAges.getOrDefault("Brad",0);
        System.out.println(result2);//12


        //Value null ise ekleme yapar, null değilse ekleme yapmaz.
        Integer result3 = studentAges.putIfAbsent("Brad",100);
        System.out.println(result3);
        System.out.println(studentAges);


        Integer result4 = studentAges.putIfAbsent("Ayhan Işık",100);
        System.out.println(studentAges);

        //Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilıcalı",100);
        System.out.println(result5);
        System.out.println(studentAges);

        //replace() methodu value leri değiştirmek için kullanılır

        studentAges.replace("Acun Ilıcalı",49);
        System.out.println(studentAges);

        //replace() methodu value leri ; key ve valueleri kontrol ettikten sonra değiştirdi
        studentAges.replace("Acun Ilıcalı",49,53);
        System.out.println(studentAges);

        //Example 3 : Map deki herbir entry i ekrana farklı bir satırda olacak şekilde yazdırınız

        //Example 3:Map deki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
        //{Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();
        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }













    }


}
