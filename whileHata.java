import java.util.Scanner;

public class selectionStatString {
    public selectionStatString() {
    }

    public static void main(String[] args) {
        // we check the first char
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir char giriniz:\n");

        try {
            while (true) {
                char leyla = keyboard.next().charAt(0);


                if (!Character.isLetter(leyla)) {
                    throw new IllegalArgumentException("Lütfen sadece harf dizini gir!");

                }

                if (leyla == 'a' || leyla == 'A') {
                    System.out.println("İlk karakter A");
break;
                } else {
                    System.out.println("İLk karakter a veya A değildir");
                }
            }
        }
            catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }
        }

