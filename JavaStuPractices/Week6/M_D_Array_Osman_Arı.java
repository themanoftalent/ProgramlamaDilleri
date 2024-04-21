
//Multi Dimension Array

public class multiDimensionArray {
    public static void main(String[] args) {                  //Osman ARI  2211502018

        int[][] cok_Boyutlu_Dizi = new int[3][3];
        cok_Boyutlu_Dizi[0] = new int[]{1, 3, 5};
        cok_Boyutlu_Dizi[1] = new int[]{2, 4, 6};
        cok_Boyutlu_Dizi[2] = new int[]{7, 8, 9};

        for (int i = 0; i < cok_Boyutlu_Dizi.length; i++) {
            for (int j = 0; j < cok_Boyutlu_Dizi[i].length; j++) {

                    System.out.print(cok_Boyutlu_Dizi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
