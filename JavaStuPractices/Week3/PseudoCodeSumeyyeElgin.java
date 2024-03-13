import java.util.Scanner;

public class PseudoCodeSumeyyeElgin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String firstLetter;
        String gender;

        System.out.print("yaşınızı giriniz: ");
        age = sc.nextInt();

        sc.nextLine(); //nextInt'ten sonra hemen nextLine gelince bir satır atlıyor. bunu önlemek için bu satırı yazdım

        System.out.print("adınızın ik harfini giriniz: ");
        firstLetter = sc.nextLine();

        System.out.print("cinsiyetinizi giriniz: ");
        gender = sc.nextLine();

        if (age < 18) {
            if (age > 16 && gender.equals("erkek") && firstLetter.equals("B")) {
                System.out.println("evde otur");
            } else {
                System.out.println("dışarı çık");
            }
        } else {
            System.out.println("gezebilirsin");
        }

    }


}
