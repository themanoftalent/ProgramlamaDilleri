//Muhammet Baran Kuzu 2111502013
//do-while vs while

//ÖRNEK 1

//Kullanıcıdan alınan değerden 10'a kadar olan sayılar yazdırılır. Kullanıcının girdiği sayı doğru aralıkta olmazsa döngünün çalışmaması için while ile döngü şartı önceden kontrol edilir.

import java.util.Scanner;

public class Do_while_1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("1 ile 10 arasında bir sayı girin: ");
		int number = read.nextInt();
		
		while(number>=1 && number<=10) {
			System.out.println(number++);
		}
	}
}
