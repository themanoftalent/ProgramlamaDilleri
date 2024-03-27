import java.util.Scanner;

public class NestedIf {
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

            if (cinsiyet.equals("E") && cinsiyet !=("K")) {
                continue;
            }


            System.out.println("Adınızın ilk harfini girin: ");
            char adIlkHarf = sc.next().toUpperCase().charAt(0);

            if  (adIlkHarf == 'B' || adIlkHarf == 'K') {
                System.out.println("Evinizde oturun.");
            } else {
                System.out.println("Sokağa çıkabilirsiniz.");
            }

            break;
        }

        sc.close();
    }
}
