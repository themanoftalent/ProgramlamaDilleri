import java.util.Scanner;

public class HataliKodOrnegi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0 ;
        int arttır = 5;
        while (true){
            int sayı = sc.nextInt();
            for (int i =0 ;i<(10+arttır);i++){
                if (i ==sayı){
                    System.out.println("Sayı bulundu"+i);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Sayı bulunamadı Tekrar deneyin");
            }
            arttır+=5;
            if (flag == 1){
                break;
            }

        }
    }
}