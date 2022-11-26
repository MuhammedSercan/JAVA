package day19datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        // Example 1: "AnlıkTarihi"(current date) ekrana yazdıran kodu yazınız

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // Example 2: "Anlık zamanı"(current time) ekrana yazdıran kodu yazınız

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // Example 3: "Anlık zamanı"(current time) ve "AnlıkTarihi"(current date) ekrana yazdıran kodu yazınız

        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println(currentDateTime);

        // Example 4 : japonyadaki anlık tarih ve zamanı ekrana yazdırınız

        LocalDateTime currentDateInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        // Example 5 : Istanbul
        LocalDateTime currentDateInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateInIstanbul);

        //Example 6 : Bugünden 789 gün sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);

        System.out.println(retireDate);

        //Example 7 : İki cocugunuzun dogum tarihleri arasındaki farkı gun olarak hesaplayan kodu yazınız
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,10,8);

        //Between(dobAli,dobVeli) methodu kullanıldığında geçmiş tarih önce yazılır.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);

        // Example 8:İstanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız

        LocalDate ist = LocalDate.of(1453,5,29);
        LocalDate cmhryt = LocalDate.of(1923,10,29);

        Long diff2 = ChronoUnit.MONTHS.between(ist,cmhryt);
        System.out.println(diff2);

        // Example 9: Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız

        LocalDate myDate = LocalDate.of(1989,4,25);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if(day>=21 && month==3){
            System.out.println("Koç");
        }else if(day<=20 && month==4){
            System.out.println("Koç");
        }else if(day>=21 && month==4) {
            System.out.println("Boğa");
        }else if(day<=20 && month==5) {
            System.out.println("Boğa");
        }












    }
}
