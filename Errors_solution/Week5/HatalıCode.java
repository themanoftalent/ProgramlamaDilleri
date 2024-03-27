public class StaticExample  {
    static int number= 10; //Bu değişken sınıfa ait nesneye ait değil.  
    static void staticmetot() { //
        System.out.println("Bu sttaikc class");
        
    }
    public static void main(String args[]) {

        System.out.println("Number"+number);

        staticmetot();

        // Obj oluştur
        StaticExample nesne = new StaticExample();
        // non static var tanımla 
        int nonstaticVar = 20;
        
        // obj çapır ve bitir
        nesne.nonstaticVar();
    }
        //burada 
        void nonstaticMethod(){
            System.out.println("Bu non static bir var");
       
      
    }
}
