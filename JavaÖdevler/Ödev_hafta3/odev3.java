import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Örnek 1: Kullanıcının girdiği sayıları toplayan program
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayı;
        int sayac = 0;

        do {
            System.out.print("Bir sayı girin (Çıkmak için 0): ");
            sayı = scanner.nextInt();
            toplam += sayı;
            sayac++;
        } while (sayı != 0);

        System.out.println("Girdiğiniz " + (sayac - 1) + " sayının toplamı: " + toplam);

        // Örnek 2: Belirli bir sayıya kadar olan sayıların toplamını bulan program
        int sayı2 = 1;
        int toplam2 = 0;

        do {
            toplam2 += sayı2;
            sayı2++;
        } while (sayı2 <= 100);

        System.out.println("1'den 100'e kadar olan sayıların toplamı: " + toplam2);

        // Örnek 3: Belirli bir aralıktaki çift sayıları bulan program
        int sayı3 = 1;

        System.out.println("1'den 20'ye kadar olan çift sayılar:");
        do {
            if (sayı3 % 2 == 0) {
                System.out.print(sayı3 + " ");
            }
            sayı3++;
        } while (sayı3 <= 20);

        // Örnek 4: Bir metin içinde belirli bir karakterin kaç kez geçtiğini bulan program
        String metin = "Merhaba dünya!";
        char aranan = 'a';
        int sayac4 = 0;
        int index4 = 0;

        do {
            index4 = metin.indexOf(aran, index4);
            if (index4 != -1) {
                sayac4++;
                index4++;
            }
        } while (index4 != -1);

        System.out.println("\n'" + aranan + "' karakteri metin içinde " + sayac4 + " kez geçiyor.");

        // Örnek 5: 1'den 10'a kadar olan sayıların karelerini ekrana yazdıran program
        int sayı5 = 1;

        System.out.println("1'den 10'a kadar olan sayıların kareleri:");
        do {
            System.out.println(sayı5 + " nin karesi: " + (sayı5 * sayı5));
            sayı5++;
        } while (sayı5 <= 10);

        scanner.close();
    }
}
