import java.util.Scanner;
public class evdeotur {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yas;
        String isim;
        String cinsiyet;

        System.out.println("İsminizin ilk harfini giriniz : ");
        isim=scanner.nextLine();

        System.out.println("Cinsiyetinizi belirtiniz: ");
        cinsiyet=scanner.nextLine();

        System.out.println("Yasinizi giriniz: ");
        yas=scanner.nextInt();

        if(yas<18){
            if (yas>16 && cinsiyet.equals("erkek") && isim.equals('B')){
                System.out.println("evde kal");

            }
            else{
                System.out.println("disarida gez");
            }
        }
        else{
            System.out.println("disarida gez");
        }
    }
}
