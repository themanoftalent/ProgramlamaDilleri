
// EBRAR BULUT 2211502059
//printf sıkıntısını çözdüm.PrintStresm kütüphanesi ekleyip tanımlayarak yaptım.
import java.io.PrintStream;
public class dattaType {

    //2211502059 Ebrar Bulut
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};


        for(int i=0 ; i< array.length; i++){

           for(int j=0 ; j<array[0].length ; j++) {
              PrintStream printf= System.out.printf(array[i][j]+ "\t");



            }
           System.out.println(" ");

        }



    }

}
