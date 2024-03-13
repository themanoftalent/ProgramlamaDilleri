import java.util.Scanner;

public class GurhanK_EvdeOtur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String isim1 = scanner.nextLine();
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.print("Erkek için 1 kadın için 0 tuşlayınız: ");
        int cinsiyet = scanner.nextInt();

        char char1 = isim1.charAt(0);
        char temp = 'B';

        if(yas<18 && cinsiyet==1) {
            if(char1==temp){
                System.out.println("Evde otur");
            }
        }
    }
}
