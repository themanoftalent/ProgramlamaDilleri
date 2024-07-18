package GurhanK_SubPrograms;

import java.util.Scanner;

public class GurhanK_Submain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SubPrograms.selamla();

        while(true){
            System.out.println("Toplama = 1");
            System.out.println("bölme = 2");
            System.out.println("çıkarma = 3");
            System.out.println("çarpma = 4");
            System.out.print("İşlem seçiniz:");
            int a = scanner.nextInt();

            switch (a){
                case 1:
                    SubPrograms.toplama();
                    break;
                case 2:
                    SubPrograms.cikarma();
                    break;
                case 3:
                    SubPrograms.bolme();
                    break;
                case 4:
                    SubPrograms.carpma();
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz!");
            }
        }

    }
}
