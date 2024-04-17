package hafta7;

public class SumeyyeElginAtamaOperatorleri {

    public static void printAll(int x, int y, int z, int w, String result, boolean isEqual, boolean isGreater, boolean result2, int b, int number, double a) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
        System.out.println("str + str2: " + result);
        System.out.println("x = y? " + isEqual);
        System.out.println("x > y? " + isGreater);
        System.out.println("x = y && x > y? " + result2);
        System.out.println(a + " to int: " + b);
        System.out.println("18 sayısında 6 ekleyip 3 çıkarınca sonuç: " + number);

    }

    public static void main (String[] args) {
        //aritmetik ifadeler
        int x, y, z, w;
        x = 10;
        y = 5;
        z = x + y;
        w = x * y;

        //overloaded operators: aşırı yüklenmiş operatörler
        String str = "hello";
        String str2 = "world";
        String result = str + " " + str2; //stringleri birleştirdik

        //type conversion: tür dönüştürme
        double a = 5.5;
        int b = (int) a; //double to int


        //relational boolean statements: ilişkisel ve boolean ifadeler
        boolean isEqual = x == y; //x ve y'nin eşit olup olmadığını kontrol et
        boolean isGreater = x > y; //x'in y'den büyük olup olmadığını kontrol et
        boolean result2 = isGreater && isEqual;

        //atama ifadeleri
        int number = 18;
        number += 6;
        number -= 3;


        printAll(x, y, z, w, result, isEqual, isGreater, result2, b, number, a);




    }
}
