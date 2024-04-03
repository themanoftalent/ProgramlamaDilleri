//2311502274 Baran Kanat
public class Staticvariableandmethod {
    static int numero = 10; // Bu değişken sınıfa ait nesneye değil
    static void staticmethod(){   //
        System.out.println("This is static class ");

    }
    void nonstaticMethod(){
        System.out.println("Bu bir non static Var" );
    }

    public static void main(String[] args) {
        System.out.println("Number=" + numero);
        staticmethod();

        //Obje oluştur
        //non static variable tanıma
        // objeyi çağır ve bitir
        Staticvariableandmethod nesne = new Staticvariableandmethod();
        int nonstaticVariable = 6;
        System.out.println(nonstaticVariable + "Bu bir non static var");
        nesne.nonstaticMethod();
    }
}
