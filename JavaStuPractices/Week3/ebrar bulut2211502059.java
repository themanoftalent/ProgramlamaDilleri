import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
public class programLanguage {
    public static void main(String[] args){
        Scanner yaz= new Scanner(System.in);

        String  cınsıyet,erkek,kız;
        String adı;
        System.out.println("yasınızı giriniz");
        int yas = yaz.nextInt();
        System.out.println("cınsıyetinizi giriniz ");
        yaz.nextLine();
         cınsıyet=yaz.nextLine();
        System.out.println("adınızın ilk harfini ");
        yaz.nextLine();
        adı=yaz.nextLine();

        if(yas <18 && yas>16 && cınsıyet.equals("erkek") && adı.equals("B") ){
            System.out.println("evde otur");
        }
        else{
           System.out.println("cık");
        }


    }
}
