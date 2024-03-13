import java.util.Scanner;
public class NurettinIlkanEvran {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Yas gir: ");
		int yas= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cinsiyet gir: ");
		String cinsiyet= sc.nextLine();
		
		System.out.println("Bas harf: ");
		String isim= sc.nextLine();
		
		
		if(yas<18 && yas>16 && cinsiyet.equals("erkek") && isim.equals("B")) {
			System.out.println("Evde otur");
		}
	}

}