import java.util.Scanner;

public class deneme {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşını gir: ");
        int yas = input.nextInt();

        if(yas <18 && yas >16 ){
            System.out.print("Cinsiyeti giriniz: ");
            String gender = input.next();


            System.out.print("Adını gir: ");
            String isim = input.next();
            Character firstLetter = isim.charAt(0);

            if(gender.equals("erkek") && firstLetter.equals('b')){
                System.out.println("evde kal");
            }
            else{
                System.out.println("Dışarı çık");

                }
            }
        }
    }

