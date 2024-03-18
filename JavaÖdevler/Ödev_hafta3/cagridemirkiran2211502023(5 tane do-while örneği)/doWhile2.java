import java.util.Scanner;
public class doWhile2 {
    public static void main(String[]args){
        int dogruTahmin = 21;
        int kullaniciTahmini;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tahmin yarışmamıza hoşgeldiniz! \n Lütfen (1-100) arası bir sayı giriniz.\n Tahmininiz:");
        do{
            kullaniciTahmini = sc.nextInt();

            if (kullaniciTahmini < dogruTahmin){
                System.out.print("Lütfen daha büyük bir sayi giriniz:");
            }
            else if (kullaniciTahmini > dogruTahmin){
                System.out.print("Lütfen daha küçük bir sayi giriniz:");
            }
            else {
                System.out.print("Doğru sayıyı buldunuz!");
            }

        }while(kullaniciTahmini != dogruTahmin);

    }
}
