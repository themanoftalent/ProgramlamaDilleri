package Hatalar;

    import java.util.Scanner;
    public class HataliKodOrnegi2SolvedSumeyyeElgin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int j = 0;
            do {
                System.out.println("Lutfen bir sayi girin: ");
                int sayi = scanner.nextInt();
                for (int i = 0; i <= sayi; i++) {
                    if (sayi == i) {
                        System.out.println("Sayi bulundu.");
                        break;
                    }
                    else {
                        System.out.println("sayı bulunamadı, tekrar dene");
                        j++;
                    }
                }
            } while (j <= 3);


            scanner.close();
        }
}

