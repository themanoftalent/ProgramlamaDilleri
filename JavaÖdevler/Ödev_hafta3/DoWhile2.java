import java.util.Scanner;
public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = 1;
        int i = 1;

        do {
            sonuc *= taban;       // sonuc = sonuc*taban
                                  //  5    =    1*5
                                  // 25    =    5*5
            i++;
        } while (i <= us);
        System.out.println("Sonuç: " + sonuc);


    }
}
