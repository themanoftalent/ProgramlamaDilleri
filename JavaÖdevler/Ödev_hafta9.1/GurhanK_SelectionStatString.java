import java.util.Scanner;

public class GurhanK_SelectionStatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Bir satır giriniz: ");

                char karakter = scanner.next().charAt(0);

                if (!Character.isLetter(karakter)) {
                    throw new IllegalArgumentException("Lütfen sadece harf dizini giriniz");
                }

                if (karakter == 'a' || karakter == 'A') {
                    System.out.println("İlk karakter a ve ya A");
                } else {
                    System.out.println("İlk karakter a veya A değil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}