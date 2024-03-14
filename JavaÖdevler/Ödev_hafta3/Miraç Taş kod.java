import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);

        System.out.println("yaşınızı giriniz: ");

        int yaş= scanner.nextInt();

        System.out.println("adınızı giriniz: ");
        String isimbas= scanner.next();

        System.out.println("cinsiyetinizi giriniz: ");
        String cinsiyet= scanner.next();

        if( (yaş<18 && yaş>16) && isimbas.equals("b") && cinsiyet.equals("erkek") ){

            System.out.println("evde kalınız");
        }
else {
            System.out.println("git");
        }


}

}
