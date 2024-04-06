import java.util.Random;

public class Main {
    public static void main(String[] args) {
Random rand = new Random();
        int[][][] matris= new int[5][5][5];

        for (int i = 0; i < matris.length; i++){
             for (int k = 0; k < matris.length; k++){
                for (int  j= 0; j < matris.length; j++){
                    matris[i][k][j] = rand.nextInt(1000);
                }
             }
        }

        for (int i = 0; i < matris.length; i++){
            for (int k = 0; k < matris.length; k++){
                for (int  j= 0; j < matris.length; j++){
                    System.out.print(matris[i][k][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}