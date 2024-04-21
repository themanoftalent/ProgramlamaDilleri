public class Ders2_1 {
    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;

    }
    public static void main(String[] args) {
        int intResult = add(6,8);
        double doubleResult = add((int) 3.6,(int    ) 8.2);
        System.out.println("\ninteger result="+intResult);
        System.out.println("\ndouble result="+doubleResult);


    }
}
