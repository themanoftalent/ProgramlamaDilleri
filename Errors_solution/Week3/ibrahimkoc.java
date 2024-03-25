import java.util.Scanner;

public class nestedIf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        do
        {
            System.out.println("Lütfen bir sayı girin: ");
            int sayi = scanner.nextInt();

            for ( i = 0; i < 10; i++) {
                if (sayi == i) {
                    System.out.println("Sayı bulundu.");
                    return;
                }
                else {
                    System.out.println("Sayı bulunamadı.");
                    break;
                }

            }
        } while (i < 10);
    }
}