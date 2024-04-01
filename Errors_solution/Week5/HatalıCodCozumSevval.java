public class StaticExample {

  static int number= 10; //Bu değişken sınıfa ait nesneye ait değil.  

  static void staticmetot() { //
    System.out.println("Bu statik bir metot");
  }

  public static void main(String args[]) {

    System.out.println("Number: " + number);

    staticmetot();

    // Obj oluştur
    StaticExample nesne = new StaticExample();

    // non-static değişken tanımla
    int nonstaticVar = 20;

    // Doğru çağrı
    nesne.nonstaticVar();

  }

  static void nonstaticVar() {
    System.out.println("Bu non-static bir metot");
  }
}
