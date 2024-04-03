import java.util.Scanner;

public class GurhanK_DoWhile2_GirilenToplam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Bir sayı girin (Çıkmak için 0'a basın): ");
            sayi = scanner.nextInt();
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
    }
}
