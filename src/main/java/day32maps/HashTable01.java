package day32maps;

import java.util.Hashtable;

public class HashTable01 {

      /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.
            3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

            Not: toString() method u objeleri consolda detayları ile görebilmek için class ların içinde oluşturulur
                 toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.
     */

    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulation = new Hashtable<>();
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Turkey", 90000000);
        System.out.println(countryPopulation);//{USA=400000000, Germany=83000000, Turkey=90000000}

        //countryPopulation.put(null,90000000);// HashTable lerde key null olamaz. NullPointerException verir.

        //countryPopulation.put("France", null);// HashTable larda value null olamaz.NullPointerException verir.

        Hashtable<String,Students>myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com",21, true));

        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age);//21






    }



}
