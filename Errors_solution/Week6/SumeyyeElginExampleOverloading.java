package hafta7;

public class SumeyyeElginExampleOverloading {

    public static int add(int a, int b) {
        return a + b;
    }



    //overloading method aşırı yüklenme burada gerçekleşti, olumsuz bir şey değil programlama dilinin esnekliğini gösterir
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int intSum = add(5,41);

        double doubleSum = add(4.1, 8.6);

        double doubleToIntSum = add((int)5.4, (int)8.30); //double method içinde casting örneği

        System.out.println("double sonuçlar: " + doubleSum);
        System.out.println("int sonuçlar: " + intSum);
        System.out.println("double to int result: " + doubleToIntSum);

    }
}
