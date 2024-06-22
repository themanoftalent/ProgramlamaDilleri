import java.util.Scanner;

public class GurhanK_SelectionStatment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir x sayisi giriniz: ");

        double x = scanner.nextDouble();

        if(x>0){
            System.out.println("x pozitif");
        }
        else if (x < 0) {
            System.out.println("x negatif");
        }
        else{
            System.out.println("x sıfırdır");
        }
    }

}
