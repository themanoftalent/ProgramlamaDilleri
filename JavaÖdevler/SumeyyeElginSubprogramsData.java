package hafta10;

import java.util.Scanner;

public class SumeyyeElginSubprogramsData {
    //sınıf seviyesinde tanımlama
    private static int x ;
    private static int y;

    public static void selamla() {
        System.out.println("selam");
    }

    public static void request(Scanner sc) {
        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();
    }

    public static int add(Scanner sc) {
        System.out.println("###TOPLAMA###");
        request(sc);
        return x + y;
    }

    public static int divide(Scanner sc) {
        System.out.println("###BÖLME###");
        request(sc);
        return x / y;
    }

    public static int multiply(Scanner sc) {
        System.out.println("###ÇARPMA###");
        request(sc);
        return x * y;
    }

    public static int sub(Scanner sc) {
        System.out.println("###ÇIKARMA###");
        request(sc);
        return x - y;
    }
}
