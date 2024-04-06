//Ahmet Emin Öz 2211502028

import java.util.Scanner;
public class staticExample {
    static int number=10;//bu degisken sınıfa ait nessneye degil.
    static void staticmethod(){
        System.out.println("Bu static class");
    }
    void nonstaticMethod(){
        System.out.println("Bu nonstatic bir variable.");
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Statik değişkenin değeri: "+number);

         staticmethod();
        //obj oluştur
        staticExample nesne = new staticExample();
        //non static tanımla
        int nonstaticVar=25;
        //onj çağır ve bitir
        System.out.println("Static olmayan değişkenin değeri: "+nonstaticVar);
        nesne.nonstaticMethod();

            }
}

