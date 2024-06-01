import java.util.Scanner;
public class doWhile4 {
    public static void main(String[]args){
        // Kullanıcının girdiği pozitif sayıları toplayan döngü.
        Scanner sc = new Scanner(System.in);
        int sayi,toplam=0,sayac=0;
        System.out.print("Lütfen toplamak istediğiniz sayıları girin (çıkmak için 0'a basınız)\n");
        do{
            sayac++;
            System.out.print(sayac + ". sayi:");
            sayi = sc.nextInt();
            toplam += sayi;
        }while (sayi != 0);
        System.out.print("Girmiş olduğunuz sayiların toplamı:"+toplam);
    }
}
