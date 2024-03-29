public class NurettinİlkanEvran_StaticExample  {
    static int number= 10; //Bu değişken sınıfa ait nesneye ait değil.  
    static void staticmetot() { //
        System.out.println("Bu static class");
        
    }
    int nonstaticVar = 20;
    
    
     void nonstaticMethod(){
            System.out.println("Bu non static bir var= "+nonstaticVar);
           }

    
    
    public static void main(String args[]) {

        System.out.println("Number"+number);

        staticmetot();

        // Obj oluştur
        NurettinİlkanEvran_StaticExample nesne = new NurettinİlkanEvran_StaticExample();
        
        // non static var tanımla 
        
        // obj çapır ve bitir
        nesne.nonstaticMethod();
    }
        //burada 
       
      
}