package day19datetime;


import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        // Example 1: Japonya ile Almanya arasındaki zaman farkını saat olarak hesaplayan kodu yazınız

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime german = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(german,japan);
        System.out.println(fark);

        // Example 2: Sabit bir tarih oluşturunuz.

        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);

        System.out.println(myDate);

        /*

        1) Javada sabit dataları (gün isimler, ay isimler, ABD deki eyalet isimleri ...) depolamak ve gerektiğinde kullanmak için
        depolar oluştururuz. Bu depolara enum denir.

         */

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba",
        // "RWANDA" icin "Cay"

        Cauntries country = Cauntries.CANADA;

        switch (country){

            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamıs Ülke");
        }








    }
}
