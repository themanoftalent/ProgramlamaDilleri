public class GurhanK_UnconditionalBranching {
    public static void main(String[] args) {
        System.out.println("Bu bir koşulsuz dallanma \n");
        for (int i = 0; i < 5; i++){
            System.out.print("sayi i : " + i);
            System.out.println("\n");
            for (int j = 5; j>i; j--){
                System.out.print("j:" + j + " ");
            }
            System.out.println("\n");
        }
    }
}
