package hafta6;

public class SumeyyeElginMultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {8, 4, 7, 3},
                {6, 7, 12, 52},
                {8, 32, 14,77}
        };

        for (int i = 0; i < arr.length; i++) { //burada satırlara başlıyoruz
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) { //burada satırdaki elemanları geziyoruz
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
            System.out.println(); //bir satır aşağıya geçmesi için
        }


    }
}
