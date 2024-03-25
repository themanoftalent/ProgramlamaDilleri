import java.util.Scanner;
public class evdeotur {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yas;
        String ad;
        String cinsiyet;

        System.out.println("Adınızın ilk harfini giriniz: ");
        ad=scanner.nextLine().toUpperCase().charAt(0) + "";

        System.out.println("Cinsiyetinizi belirtiniz: ");
        cinsiyet=scanner.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        yas=scanner.nextInt();

        if(yas<18){
            if (yas > 16 && cinsiyet.equals("erkek") && (ad.equals("b") || ad.equals("B"))){
                System.out.println("Evde kal");
            }
            else{
                System.out.println("Dışarı çık");
            }
        }
        else{
            System.out.println("Dışarı cık");
        }
    }
}
