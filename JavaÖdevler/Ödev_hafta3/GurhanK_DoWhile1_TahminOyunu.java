import java.util.Random;
import java.util.Scanner;

public class GurhanK_DoWhile1_TahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tahminEdilecekSayi = random.nextInt(100) + 1; // parantez içi son sayıyı , sonraki artı başlayacağı sayıyı belirler
        int tahmin;
        int denemeSayisi = 0;
        boolean dogruTahmin = false;

        System.out.println("1 ile 100 arasında bir sayıyı tahmin edin.");

        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin == tahminEdilecekSayi) {
                dogruTahmin = true;
                break;
            } else if (tahmin < tahminEdilecekSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Daha küçük bir sayı girin.");
            }
        } while (denemeSayisi<10);

        if (dogruTahmin) {
            System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
        } else {
            System.out.println("Oyunu kaybettiniz, doğru sayı: " + tahminEdilecekSayi);
        }
    }
}
