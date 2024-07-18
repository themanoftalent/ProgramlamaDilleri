package GurhanK_SubPrograms;

import java.util.Scanner;

public class SubPrograms {
    Scanner scan = new Scanner(System.in);

    public static void selamla() {
        System.out.println("Selamlar");
        System.out.println("---------------------------------");
    }

    public static void toplama(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Toplama için 1. sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("Toplama için 2. sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + (a+b));
        System.out.println("---------------------------------");
    }

    public static void cikarma(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Çıkarma için 1. sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("Çıkarma için 2. sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + (a-b));
        System.out.println("---------------------------------");
    }

    public static void carpma(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Çarpma için 1. sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("Çarpma için 2. sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + (a*b));
        System.out.println("---------------------------------");
    }

    public static void bolme(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bölme için 1. sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("Bölme için 2. sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + (a/b));
        System.out.println("---------------------------------");
    }
}
