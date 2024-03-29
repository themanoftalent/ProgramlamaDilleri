//Ahmet Emin Öz 2211502028
//Not ortalaması hesaplama
import java.util.Scanner;
public class dowhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int not;
        int sayac=0;
        float ortalama;
        int toplamnot=0;
        /*
        //While dongusu
        System.out.println("Notu giriniz, çıkmak için 1'e basınız: ");
        not=input.nextInt();
        while(not!=-1){
        if(not>=0){
            sayac++;
            toplamnot+=not;
            }
            else{
            System.out.println("0'dan büyük bir not giriniz!: ");
            }

            System.out.println("Notu giriniz, çıkmak için 1'e basınız: ");
            not=input.nextInt();
        }
         ortalama=toplamnot/sayac;
        System.out.println(sayac + " kişinin not ortalaması= "+ortalama);

         */
        // Do while döngüsü

        do {
            System.out.println("Notu giriniz, çıkmak için -1'e basınız: ");
            not = input.nextInt();
            if(not>=0){
                sayac++;
                toplamnot+=not;
            }
            else {
                System.out.println("0'dan büyük bir not giriniz: ");
            }
            System.out.println("Notu giriniz, çıkmak için 1'e basınız: ");
            not=input.nextInt();
        }while(not!=-1);
        ortalama=toplamnot/sayac;
        System.out.println(sayac+" kisinin not ortalaması= "+ortalama);
    }
}

//kullanıcıdan girilen sayiya kadar toplamını hesaplama
import java.util.Scanner;
public class dowhile2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        int sayac=0;
        int toplam=0;
        System.out.println("Bir sayi giriniz: ");
        sayi= input.nextInt();
        do{
            toplam+=sayac;
            sayac++;
        }while(sayac<=sayi);
        System.out.println("Toplam = "+toplam);
        }
    }

//Faktoriyel hesabı
// Do-while döngüsü
import java.util.Scanner;
public class dowhile3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       /*
        int n;
        int faktoriyel = 1;
        int i = 1;

        System.out.println("Faktöriyelini hesaplamak istediginiz sayiyi giriniz: ");
        n=input.nextInt();
        do {
            faktoriyel *= i;
            i++;
        } while (i <= n);
        System.out.println("Faktöriyel: " + faktoriyel);
    }
}
*/
// While 
        int n;
        int faktoriyel = 1;
        int i = 1;
        System.out.println("Faktöriyelini hesaplamak istediginiz sayiyi giriniz: ");
        n=input.nextInt();
        while (i <= n) {
            faktoriyel *= i;
            i++;
        }
        System.out.println("Faktöriyel: " + faktoriyel);
    }
}


//Girilen sayiya kadar yazdırma
import java.util.Scanner;
public class dowhile4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        int sayac=0;
        System.out.println("Bir sayi giriniz: ");
        sayi=input.nextInt();
    /*//while dongusu
        while(sayac<=sayi){
            System.out.println(+sayac);
            sayac++;
        }
    */
        //do while dongusu
        do{
            System.out.println(+sayac);
            sayac++;
        }while(sayac<=sayi);
    }
}


//Girilen sayiya kadar olan sayiların tek veya çift oldugunu ispatla
import java.util.Scanner;
public class dowhile5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int sayac = 0;
        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();
        do {
            while (sayac % 2 == 0) {
                System.out.println(sayac + " bir cift sayidir");
                sayac++;
            }

            while (sayac % 2 != 0) {
                System.out.println(sayac+ " bir tek sayidir");
                sayac++;
            }
        } while (sayac <= sayi);
    }
}





