import java.util.Scanner;

public class GurhanK_DoWhile4_Faktöriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Girilensayi;
        long faktoriyel = 1;

        do {
            System.out.print("Faktöriyel için pozitif bir sayı girin: ");
            Girilensayi = scanner.nextInt();
        } while (Girilensayi < 0);

        int sayac = 1;

        do {
            faktoriyel *= sayac;
            sayac++;
        }while(sayac <= Girilensayi);


        System.out.println(Girilensayi + "! = " + faktoriyel);
    }
}
