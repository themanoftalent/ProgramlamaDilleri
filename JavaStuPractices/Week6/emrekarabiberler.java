public class Main{
  public static void printAll(int x,int y,int z,int w,String result,boolean isEqual,boolean isGreater,boolean result2,int number){

        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(result);
        System.out.println(isEqual);
        System.out.println(isGreater);
        System.out.println(result2);
        System.out.println(number);
    }


public static void main(String[] args){

    int x,y,z,w; 
    x= 10;
    y= 5;
    z= x + y;
    w= x * y;
    String str1 = "hello";
    String str2 = "world";
    String result = str1 + str2;
    double a = 5.5;
    int b = (int) a;
    boolean isEqual = x == y;
    boolean isGreater = x > y;
    boolean result2 = isGreater && isEqual;
    int number = 18;
    number +=6;
    number -=3;

}
}
