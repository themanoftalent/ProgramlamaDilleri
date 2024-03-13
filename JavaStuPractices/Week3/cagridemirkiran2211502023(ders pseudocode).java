import java.util.Scanner;
public class derstest {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("yasinizi giriniz:");
        int yas=sc.nextInt();
        System.out.print("cinsiyetinizi giriniz:");
        String gender=sc.next();
        System.out.print("Adınızın ilk harfini giriniz:");
        String first=sc.next();

        if((yas>16 && yas<18) && gender.equals("erkek") && first.equals("b")){
            System.out.print("evde otur.");
        }
        else {
            System.out.print("none");
        }
    }

}
