import java.util.Scanner;

public class HataliKodOrnegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();
        int i=0;
        int yakalayici = 0;
        int dogrutahmin = 0;
        do {

            i++;
            if (sayi == i) {
                dogrutahmin=i;
                yakalayici=1;
            } else {

            }
        }
            while (i <sayi) ;
        if (yakalayici==1){
            System.out.println("Sayı bulundu.");
            System.out.println(+dogrutahmin);
        }
        else {
            System.out.println("Sayı bulundu.");
        }


        scanner.close();
    }
}
