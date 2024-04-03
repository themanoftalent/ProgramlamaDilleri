import java.util.Scanner;
public class While3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,i=2;
        boolean asal = true;

        System.out.println("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        while(i<sayi)
        {
            if(sayi%i == 0 )
            {
                asal = false;
                break;
            }
            i++;
        }

        if(asal)
        {
            System.out.println(sayi+" Bir asal sayıdır.");
        }
        else
        {
            System.out.println(sayi+" Bir asal sayı değildir.");
        }
    }
}
