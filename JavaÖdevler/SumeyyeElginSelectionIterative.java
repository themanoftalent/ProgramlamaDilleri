package hafta10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumeyyeElginSelectionIterative {
    public static void main(String[] args) {
        // we check the first char
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Bir char giriniz:\n");
                char leyla = keyboard.next().charAt(0);
                if (!Character.isLetter(leyla)) {
                    throw new IllegalArgumentException("Lütfen sadece harf dizini gir!");
                }
                if (leyla == 'a' || leyla == 'A') {
                    System.out.println("İlk karakter A");

                } else {
                    System.out.println("İLk karakter a veya A değildir");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try{
                    System.out.println("you can exit the program with entering 0, you can contiune the program with any number");
                    int exit = keyboard.nextInt();
                    if (exit == 0) {
                        System.exit(0);
                    } else {
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("lütfen geçerli bir input giriniz");
                }
            }
        }

    }
}
