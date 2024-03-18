//Ahmet Emin Öz 2211502028

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
