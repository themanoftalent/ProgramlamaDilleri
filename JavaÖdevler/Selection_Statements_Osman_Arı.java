
//Selection Statements(Seçim İfadeleri) Örneği (1.örnek)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {                  //Osman Arı  2211502018
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        double x=sc.nextDouble();
       // int x=10;
        if (x > 0) {
            System.out.println("x pozitif");

        }
        else if(x<0){
            System.out.println("x negatif");
        }
        else{
            System.out.println("x  sıfır");
        }
    }
}
