package hafta10;

import java.util.Scanner;

public class SumeyyeElginGuardedCommands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("hangi gün: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            default:
                System.out.println("hafta sonu");
        }
    }
}
