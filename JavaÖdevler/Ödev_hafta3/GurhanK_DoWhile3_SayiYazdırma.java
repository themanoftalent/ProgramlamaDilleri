public class GurhanK_DoWhile3_SayiYazdırma {
    public static void main(String[] args) {
        int sayi = 1;      // Başlangıç sayısı buraya yazılır

        do {
            System.out.print(sayi + " ");
            sayi++;
            if(sayi%10 == 0){
                System.out.println("\n");
            }
        } while (sayi <= 20);       // Son yazılacak sayi buraya yazilir
    }
}
