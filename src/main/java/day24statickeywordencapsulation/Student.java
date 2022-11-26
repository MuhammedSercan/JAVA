package day24statickeywordencapsulation;

public class Student {

    //Encapsulation: "Data Hiding(Gizlenmek)" demektir.
    //Datayı niçin gizlersiniz? Datayı dış etkenlerden korumak için gizleriz.
    //Datayı nasıl gizlersiniz? Access Modifierini "private" yaparak gizleriz.
    //Datayı gizledikten sonra başka class larrdan okumak istersen ne yaparsın?
    //"get method"lar(getter) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz.
    //Datayı gizledikten sonra başka class larrdan değiştirmek istersen ne yaparsın?
    //"set method"lar(setter) oluşturarak gizlediğimiz data' ları değiştirebiliriz.

    // Variable nin data type ile get methodun return type ı aynı olmalıdır.
    // Variablenin isminin başına "get" koyularak get method isimlendirilir.(kodun çalışması için zorunlu değil, gremer kuralı)
    // Variablenin data type i boolean ise "is" + variable name olarak isimlendirme yapılır.

    public String stdName   = "Tom Hanks";
    private String stdId    = "TH202201";
    private double gpa      = 3.8;
    private boolean retired = false;

    public String getStdId() {

        return stdId;
    }

    public double getGpa() {

        return gpa;
    }

    public boolean isRetired() {

        return retired;
    }

    // access modifieri public
    // void olur çünkü isim değişiyor
    // isimlendirme: set+ variable name
    // variable adı neyse, parametre adı da o olur.




    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
