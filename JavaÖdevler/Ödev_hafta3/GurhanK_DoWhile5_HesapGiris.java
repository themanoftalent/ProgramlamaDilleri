import java.util.Scanner;

public class GurhanK_DoWhile5_HesapGiris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String isim;
        String sifre;

        System.out.println("Hesap oluşturma! \n");
        System.out.print("İsminizi giriniz: ");
        isim = scanner.nextLine();
        System.out.print("Şifrenizi oluşturunuz: ");
        sifre = scanner.nextLine();

        String girilenIsim;
        String girilenSifre;
        do {
            System.out.print("Kullanıcı adı: ");
            girilenIsim = scanner.nextLine();
            System.out.print("Şifre: ");
            girilenSifre = scanner.nextLine();

            if (!girilenIsim.equals(isim) || !girilenSifre.equals(sifre)) {
                System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyin.");
            }
        } while (!girilenIsim.equals(isim) || !girilenSifre.equals(sifre));

        System.out.println("Giriş başarılı! Hoş geldiniz, " + girilenIsim + "!");


    }
}
