import java.util.Scanner;
public class doWhile1 {
    public static void main(String[] args) {
        // Kullanıcı bir pozitif sayı girene kadar tekrar eden döngü.
        Scanner sc = new Scanner(System.in);
        int sayi;
        do {
            System.out.print("Lütfen pozitif bir sayi giriniz:");
            sayi = sc.nextInt();
        } while (sayi <= 0);
        System.out.print("girdiğiniz sayi pozitiftir:"+sayi);
    }

}
