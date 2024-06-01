import java.util.Scanner;
public class doWhile5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int baslangic,bitis;

        do {
            System.out.print("Baslangic sayisini giriniz:");
            baslangic = sc.nextInt();
            System.out.print("Bitis sayisini giriniz:");
            bitis = sc.nextInt();
        }while(baslangic >= bitis);

        int toplam=0,sayi = baslangic;
        do {

            toplam += sayi;
            sayi++;

        }while (sayi <= bitis);
        System.out.print("Girdiğiniz aralıktaki sayilarin toplamı:"+toplam);
    }
}
