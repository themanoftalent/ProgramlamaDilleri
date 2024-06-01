import java.util.Scanner;
public class doWhile3 {
    public static void main(String []args) {
        // Girilen sayinin faktöryelini bulan döngü.(önceki kodda olan pozitif sayi döngüsünü kullanalım)
        Scanner sc = new Scanner(System.in);
        int sayi;
        do {
            System.out.print("Lüfen pozitif bir sayi giriniz:");
            sayi = sc.nextInt();
        }while (sayi <= 0);

        int sayac = 1;
        int fakt = 1;

        do {
            fakt *= sayac;
            sayac++;
        }while(sayac <= sayi);
        System.out.print("Girdiğiniz sayi: "+sayi + "!\n"+"faktöriyeli: "+fakt);
    }
}
