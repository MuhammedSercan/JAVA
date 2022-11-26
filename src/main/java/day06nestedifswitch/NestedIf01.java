package day06nestedifswitch;


public class NestedIf01 {
    public static void main(String[] args) {

        /*
        Password un ilk harfi buyuk harf ise
        'A' olursa geçerli password aksi halde geçersiz password;
        Password un ilk harfi kucuk harf ise
        'z' olursa geçerli password aksi halde geçersiz password.
         */

        //Java nested kodları çalıştırırken çok zaman harcar buna "time complexity" denir.
        // Bu yüzden zorunlu olmadıkça nested kullanılmaz.

        String password = "Axy12!";
        char ilkHarf = password.charAt(0);


        if(ilkHarf>='A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){
            System.out.println("Geçerli Password");
        }else{
            System.out.println("Geçersiz Password");
        }
        }else if(ilkHarf>='a' && ilkHarf<='z'){
            if(ilkHarf=='z'){
                System.out.println("Geçerli password");
            }else{
                System.out.println("Geçersiz password");
            }
        }else{
            System.out.println("İlk Karakter Harf Olmalıdır");
        }











    }
}
