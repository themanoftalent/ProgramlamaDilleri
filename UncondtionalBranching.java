public class UncodntionalBranching {
    //for and if
    public static void main(String[] args) {
        System.out.println("Bu bir koşulsuz dallanma\n");
        for (int i =0; i< 5; i++) {
            System.out.println("sayı " +i);

            for (int j=0; j<=i;j--){

//                System.out.println("\nNumber to stop "+ j);

                if (j < 0) {
                    break;
                }
                System.out.println("\nNumber to stop "+ j);

            }
        }
    }
}
