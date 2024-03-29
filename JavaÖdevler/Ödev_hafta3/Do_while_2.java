//Muhammet Baran Kuzu 2111502013
//do-while vs while

//ÖRNEK 2

//Kullanıcıdan alınan sayılar toplanır, çıkış için kullanıcı 0 girmelidir. do-while ile döngüye en az bir kez girileceğinden programın başında fazladan bir kontrol mekanizması kullanılabilir.

import java.util.Scanner;

public class Do_while_2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Bir sayı girin (Çıkış için 0 girin): ");
		int number = read.nextInt();
		
		if(number==0) System.exit(0);
			
		do {
			sum+=number;
			System.out.print("Bir sayı girin (Çıkış için 0 girin): ");
			number = read.nextInt();
		} while(number!=0);
		
		System.out.println("Girdiğiniz sayılar toplamı: " + sum);
	}
}
