import java.util.Scanner;

public class odev_hafta3_sumeyyeelgin_180324_dowhile_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. örnek
        int i = 1;
        while (i < 4) {
            System.out.println("i hala 4'ten küçük, i'nin değeri: " + i);
            i++;
        }
        System.out.println("işte şimdi i = " + i);


        /*int j = 1;
        do {
            System.out.println("j hala 4'ten küçük, i'nin değeri: " + j);
            j++;
        } while (j < 4);
        System.out.println("işte şimdi j = " + j);*/

        System.out.println("\n");

        //2. örnek
        int k = 10;
        while(k > 10) {
            System.out.println(k);
            k--;
        }

        //üstteki kod çalışmayacak çünkü koşulu sağlamıyor. ancak do while baştaki do sebebiyle kodu bir kez çalıştıracak.

        int l = 10;
        do {
            System.out.println(l);
            l--;
        } while (l > 10);

        System.out.println("\n");

        //3. örnek
        String[] letters = {"E", "L", "İ", "F"};

        int m = 0;
        while(m < letters.length) {
            System.out.print(letters[m] + " ");
            m++;
        }
        System.out.println("\n");

        /*int n = 0;
        do {
            System.out.print(letters[n]+ " ");
            n++;
        } while (n < letters.length);*/

        System.out.println("\n");

        //4. örnek
        int[] myNum = new int[4];
        int p = 0;

        while (p < myNum.length) {
            System.out.print("bir sayı giriniz: ");
            int num = sc.nextInt();
            myNum[p] = num;
            p++;
        }


        /*int r = 0;
        do {
            System.out.print("bir sayı giriniz: ");
            int num = sc.nextInt();
            myNum[r] = num;
            r++;
        } while (r < myNum.length);*/

        for (int a = 0; a < myNum.length; a++) {
            System.out.print(myNum[a] + " ");
        }

        System.out.println("\n");

        //5. örnek
         int b = 1;
         while(b <= 10) {
             if (b % 2 == 0) {
                 System.out.println(b + " bir çift sayıdır.");
                 b++;
             } else if (b % 2 != 0) {
                 System.out.println(b + " bir tek sayıdır");
                 b++;
             }
         }

        /*int c = 1;
         do {
             if (c % 2 == 0) {
                 System.out.println(c + " bir çift sayıdır.");
                 c++;
             } else if (i % 2 != 0) {
                 System.out.println(i + " bir tek sayıdır");
                 c++;
             }
         } while (c <= 10);*/


    }
}
