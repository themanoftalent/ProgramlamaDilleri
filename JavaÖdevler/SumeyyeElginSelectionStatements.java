package hafta10;

import java.util.Scanner;

public class SumeyyeElginSelectionStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x sayısını girin: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("x pozitif");
        } else if (x < 0) {
            System.out.println("x negatif");
        } else {
            System.out.println("x sıfır");
        }
    }
}
