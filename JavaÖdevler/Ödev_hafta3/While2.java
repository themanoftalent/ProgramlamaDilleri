import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
        Scanner omer = new Scanner(System.in);

        int sayi,fak=1,i=1;

        System.out.println("Lütfen bir sayı giriniz:");
        sayi = omer.nextInt();

        while(i <= sayi)
        {
            fak*=i;
            i++;
        }

        System.out.println(sayi+" Sayısının faktöriyeli: "+fak);


    }
}
