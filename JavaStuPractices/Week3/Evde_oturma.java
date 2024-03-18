//Muhammet Baran Kuzu 2111502013

import java.util.Scanner;

public class Evde_oturma {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		System.out.print("Yaş gir: ");
		int age = oku.nextInt();
		oku.nextLine();
		
		System.out.print("Cinsiyet gir (E/K): ");
		String gender = oku.nextLine();
		
		System.out.print("İsminin baş harfi: ");
		String name = oku.nextLine();
		
		if(age<18) {
			if(age>16 && gender.equals("E") && name.equals("b"))
				System.out.println("Evde otur.");
		}
	}
}
