package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        // Example 1 : Javadan aldığınız dateyi ay , gün, yıl olarak yazınız

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //"MM" 10dan küçük ayları 01,02,03 şeklinde yazar
        String formattedDate1 =dtf1.format(currentDate);
        System.out.println(formattedDate1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 =dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 =dtf3.format(currentDate);
        System.out.println(formattedDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//"M" 10dan küçük ayları 1,2,3 şeklinde yazar
        String formattedDate4 =dtf4.format(currentDate);
        System.out.println(formattedDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5 =dtf5.format(currentDate);
        System.out.println(formattedDate5);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");//"d" 10dan küçük günleri 1,2,3 şeklinde yazar, 01,02,03 kullanmaz.
        String formattedDate6 =dtf6.format(currentDate);
        System.out.println(formattedDate6);


        // Example 2 : Javadan adığınız time in formatını değiştiriniz

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 Saat sistemini; "hh" 12 Saat sistemini kullanır.
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");// bu format pm am ekleyerek 12 saatlik sistemi kullanır
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);

    }
}
