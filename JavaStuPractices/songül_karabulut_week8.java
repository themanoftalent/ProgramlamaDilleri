public class Ders2 {
    public static void main(String[] args) {
        int x,y,z,w;
        x=10; y=5; z=x+y; w=x*y;
        String str1= "Meow";
        String str2= "Meoow";
        String result= str1+str2;
        double a=5.5;
        int b=(int) a;
        boolean isEqual= x==y;
        boolean isGreater= x>y;
        boolean result2= isGreater && isEqual;
        int number =18;
        number +=6;
        number -=3;
        printAll(x,y,z,w,b,number,result,isEqual,isGreater,result2);

    }

    public static void printAll(int x, int y, int z, int w, int b, int number, String result, boolean isEqual, boolean isGreater, boolean result2){
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);
        System.out.println("w:"+w);
        System.out.println("b:"+b);
        System.out.println("number:"+number);
        System.out.println("result:"+result);
        System.out.println("isEqual:"+isEqual);
        System.out.println("isGreater:"+isGreater);
        System.out.println("result2:"+result2);
        
    }

}
