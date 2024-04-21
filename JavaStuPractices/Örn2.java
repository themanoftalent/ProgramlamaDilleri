public class Örn2 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int intresult=add(5,4);
        double doubleresult=add(3.5,7.1);
        System.out.println("integer="+intresult);
        System.out.println("double="+doubleresult);
    }
}
