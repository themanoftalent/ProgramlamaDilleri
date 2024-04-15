public class Multiarray {
    public static void main(String[] args) {
        int sayı = 1;
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size;i++){
            for (int y =0; y< size;y++){
                matrix[i][y] = sayı;
                sayı++;
                System.out.print(matrix[i][y] +  " " );
            }
            System.out.print("\n");
        }

    }
}
