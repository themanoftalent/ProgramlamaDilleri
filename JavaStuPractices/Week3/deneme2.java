import java.util.Scanner;

class Deneme {
    public static void main(String[] args) {
        int yas;
        String cinsiyet;
        String ad;
        Scanner input = new Scanner(System.in);
        System.out.println("Yas giriniz : ");
        yas = input.nextInt();
        System.out.println("Cinsiyet giriniz : ");
        cinsiyet = input.next();
        System.out.println("Isim giriniz : ");
        ad = input.next();
        if (yas < 18 && 16 < yas && cinsiyet.equals("erkek") && ad.startsWith("B")) {
          System.out.println("evde otur!");
        } else {
            System.out.println("disari cik!");
        }
    }
