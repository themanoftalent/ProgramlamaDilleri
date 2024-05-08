//Ahmet Emin Öz 2211502028
import java.util.Scanner;
public class evdencıkma {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        //adı b ile start ve yas aralıgı 13 ve 18 aralıgında olan kızlar evde dursun
        int yas;
        boolean yasıtuttu=true;

        System.out.println("Yasinizi giriniz: ");
        yas=input.nextInt();
        if(yas<13 || yas>18){
            yasıtuttu=false;
        }
        if(yasıtuttu){
            System.out.println("Cinsiyetinizi giriniz: ");
            String cinsiyet=input.next().toUpperCase();


            if(cinsiyet.equals("K")){
                System.out.println("Adınızın bas harfini giriniz: ");
                char isim=input.next().toUpperCase().charAt(0);
                    if(isim=='B'){
                        System.out.println("Evde kal, sınava çalış");
                    }
                    else{
                        System.out.println("Dısarı cıkabilirsin");}

            }
            else{
                System.out.println("Dısarı cıkabilrsin");
            }

        }

    }
}
