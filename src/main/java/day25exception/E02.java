package day25exception;

public class E02 {


    public static void main(String[] args) {

        String arr[]={"Ali","Can","Veli","Han"};

        getElementFromArray(arr,2);
        getElementFromArray(arr,0);
        getElementFromArray(arr,4);
    }

    //Bir String Array den index girerek eleman elde edebilmek için bir method oluşturun

    public static void getElementFromArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            //Bu benim teknik olmayan açıklamam
            System.out.println("Array indexte bir problem meydana geldi");
            //Exception ile ilgili detaylı teknik mesaj
            e.printStackTrace();
            //Renkli uyarı
            System.err.println("Array indexte bir problem meydana geldi");
        }



    }



}
