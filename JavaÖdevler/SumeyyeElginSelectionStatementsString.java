package hafta10;

import java.util.Scanner;

public class SumeyyeElginSelectionStatementsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while (true) {
           try {
               System.out.print("bir string giriniz: ");
               char character = sc.next().charAt(0);

               if (Character.isLetter(character)) {
                   if (character == 'a' || character == 'A') {
                       System.out.println("kelimenizin ilk harfi a/A");
                   } else {
                       System.out.println("ilk harf a/A değil");
                   }
               } else {
                   throw new IllegalArgumentException("lütfen sadece harf dizini giriniz");
               }
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }


        /*try{
            System.out.print("bir string giriniz: ");
            char character = sc.next().charAt(0);

            if (!Character.isLetter(character)) {
                throw new IllegalArgumentException("lütfen sadece harf dizini giriniz");
            }
            if (character == 'a' || character == 'A') {
                System.out.println("kelimenizin ilk harfi a/A");
            } else {
                System.out.println("ilk harf a/A değil");
            }
        }catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }*/


    }
}
