package Hatalar;

import java.util.Scanner;

public class HataliKodOrnegiSolvedSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girdiğiniz sayı çifttir.");
        } else {
            System.out.println("Girdiğiniz sayı tek sayıdır.");
        }

        String[] dizi = new String[5];
        dizi[4] = "Hatalı Kod Ornegi"; // Dizi indeksi hatası

        scanner.close();
    }
}
