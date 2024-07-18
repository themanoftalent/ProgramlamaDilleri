package week9.Week9Retrun;
import java.util.Scanner;


public class Data {
    //sınıf seviyesinde tanımlama
    private static int x;
    private static int y;

    //Metotlar
    public static void selamla() {

        System.out.println("Selam");
    }

    public static int Topla(){
        Scanner sayi = new Scanner(System.in);
        System.out.println("X değeri gir");
        x = sayi.nextInt();
        System.out.println("y değeri gir");
        y = sayi.nextInt();


        return x+y;

    }
    public static int Cikarma(){
        Scanner sayi = new Scanner(System.in);
        System.out.println("X değeri gir");
        x = sayi.nextInt();
        System.out.println("y değeri gir");
        y = sayi.nextInt();

        return x-y;

    }
    public static int Carpma(){

        Scanner sayi = new Scanner(System.in);
        System.out.println("X değeri gir");
        x = sayi.nextInt();
        System.out.println("y değeri gir");
        y = sayi.nextInt();

        return x*y;

    }
    public static int Bolme(){
        Scanner sayi = new Scanner(System.in);
        System.out.println("X değeri gir");
        x = sayi.nextInt();
        System.out.println("y değeri gir");
        y = sayi.nextInt();

        return x/y;

    }

}




// -----------------------------------
package week9.Week9Retrun;

public class sub_main {
    public static void main(String[] args) {
        Data.selamla();

       int topla = Data.Topla();
        System.out.println("Toplam = "+ topla);

        int cikarma = Data.Cikarma();
        System.out.println("Çıkarma = "+ cikarma);

        int carpma = Data.Carpma();
        System.out.println("Çarpma = "+ carpma);

        int bolme = Data.Bolme();
        System.out.println("Bolme = "+ bolme);
    }
}


  
