//Muhammet Baran Kuzu 2111502013
//do-while vs while

//ÖRNEK 5

//Bu örnekteki program basit dört işlem yapan bir hesap makinesi olarak işler.

import java.util.Scanner;

public class Do_while_5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.print("Yapılacak aritmetik işlemi seçin (1=toplama, 2=çıkarma, 3=çarpma, 4=bölme): ");
			int operation = read.nextInt();
			
			if(operation<1 || operation>4) break;
			
			System.out.print("İlk sayınızı girin: ");
			float number1 = read.nextFloat();
			System.out.print("İkinci sayınızı girin: ");
			float number2 = read.nextFloat();
			
			if(operation==1) System.out.println("İşlem sonucu: " + (number1+number2));
			
			else if(operation==2) System.out.println("İşlem sonucu: " + (number1-number2));
			
			else if(operation==3) System.out.println("İşlem sonucu: " + (number1*number2));
			
			else System.out.println("İşlem sonucu: " + (number1/number2));
		} while(true);
	}
}
