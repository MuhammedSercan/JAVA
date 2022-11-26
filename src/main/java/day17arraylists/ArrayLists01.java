package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Tom");
    names.add("Thomas");
    names.add("Tahsin");
    names.add("Trump");
    names.add("Taceddin");

        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

         names.removeAll(cities);// removeAll() kullandığımızda sadece ilk list degisir, parantezin içindeki list degismez.
         System.out.println(names);
         System.out.println(cities);

         List<String>myNames = new ArrayList<>();
         myNames.add("Thomas");
         myNames.add("Tahsin");

         boolean sonuc1 = names.containsAll(myNames);//Bir listin içinde coklu elemanların var olup olmadığını kontrol eder.
        //Hepsi varsa true, en az biri yoksa false verir

        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // Example 1: "a" listinde "Shoes" elemanının ilk görünümünü siliniz

        a.remove("Shoes");
        System.out.println(a);

        // Example 2: "Shoes" elemanlarının tüm görünümlerini siliniz

        List<String>silinecekler = new ArrayList<>();

        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);

        // Example 3: Bir tane salary listi oluşturun, eger salary 10000 den az ise %20; 1000den çok ise %10 zam yapınız

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for(Double w : salary){
            if(w<10000){
                salary.set(salary.indexOf(w), w*1.2);
            }else{
                salary.set(salary.indexOf(w), w*1.1);
            }

        }


        System.out.println(salary);

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('t');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way:
        int counter = 0;//Flag

        for(int i=0; i<m.size(); i++){
            if(m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler esittir");
        }

        // 2.yol

        boolean esitMi = m.equals(n);

        if(esitMi){
            System.out.println("Listeler esittir");

        }else{
            System.out.println("Listeler esit degildir");
        }
















    }

}
