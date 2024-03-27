//Muhammet Baran Kuzu 2111502013
//do-while vs while

//ÖRNEK 3

//Kullanıcının girdiği sayıyı basamaklarına ayırma. Sayının 0 olması durumunda 0'ın basamak değerinin de gösterilmesi için kontrolden geçmeden en az bir kez döngüye girilmesi gerekir. do-while kullanımı daha uygun olacaktır.

import java.util.Scanner;

public class Do_while_3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Basamaklarına ayırılacak sayıyı girin: ");
		int number = read.nextInt();
		int i = 1;
		
		do {
			if(i==10) System.out.println(i + "'lar basamağındaki sayı " + number%10);
			else System.out.println(i + "'ler basamağındaki sayı " + number%10);
			number /= 10;
			i *= 10;
		} while(number!=0);
	}
}
