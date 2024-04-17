import java.util.Scanner;

public class MultiDim_Arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 2;                       // Matris size buradan blirlenir
        int[][] matrix  = new int [size][size];

        for (int i = 0; i<size; i++){       //Kullanıcıdan Matris alır
            for (int j = 0; j<size; j++){
                System.out.print("Matris"+i+j+": ");
                int a = scan.nextInt();
                matrix[i][j] = a;
            }
        }

        for (int a = 0; a<size; a++){       //Girilen Matrisi yazdırır
            for (int b = 0; b<size; b++){
                System.out.println("Matris"+a+b+": "+ matrix[a][b]);
            }
        }

        for (int a = 0; a<size; a++){       //Girilen Matrisi yazdırır
            for (int b = 0; b<size; b++){
                System.out.print(matrix[a][b]+" ");
            }
            System.out.println(" ");
        }


    }
}
