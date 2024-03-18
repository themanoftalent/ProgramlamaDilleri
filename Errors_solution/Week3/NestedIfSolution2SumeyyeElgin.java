package Hatalar;

import java.util.Scanner;

public class NestedIfSolution2SumeyyeElgin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Yaşınızı girin: ");
            int yas = sc.nextInt();

            if (yas < 16 || yas > 18) {
                System.out.println("Çıkış için 1'e basın.");
                int exitChoice = sc.nextInt();
                if (exitChoice == 1) {
                    break;
                }}

            System.out.println("Cinsiyetinizi girin (E/K): ");
            String cinsiyet = sc.next().toUpperCase();

            if (cinsiyet.equals("K") || cinsiyet.equals("E")) {
                if (cinsiyet.equals("K")){;
                    break;
                } else {
                    System.out.println("Adınızın ilk harfini girin: ");
                    char adIlkHarf = sc.next().toUpperCase().charAt(0); //toUpperCase dendiğinde stringi küçük harf girsen bile büyük harfe çeviriyor

                    if  (adIlkHarf == 'B' || adIlkHarf == 'K') {
                        System.out.println("Evinizde oturun.");
                    } else {
                        System.out.println("Sokağa çıkabilirsiniz.");
                    }
                }
            }


            break;
        }

        sc.close();
    }
}