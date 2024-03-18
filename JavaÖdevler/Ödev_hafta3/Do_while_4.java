//Muhammet Baran Kuzu 2111502013
//do-while vs while

//ÖRNEK 4

//Girilen sayının asallığını kontrol eder. Sayı yalnızca 0'dan büyük ise döngüye girmesi için while kullanılabilir. Program, sayının tam bölen sayısını tutmak için bir sayaç kullanır, asal sayı olması için yalnızca iki tam böleninin olması gerekir: 1 ve kendisi.

import java.util.Scanner;

public class Do_while_4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Sayınızı girin: ");
		int number = read.nextInt();
		int i = 1, counter = 0;
		
		while(i<=number) {
			if(number%i==0) counter++;
			i++;
		}
		
		if(counter==2) System.out.println("Sayınız asal bir sayı");
		
		else System.out.println("Sayınız asal değil");
	}
}
