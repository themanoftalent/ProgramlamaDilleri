package mynewproject1;
import java.util.Scanner;
public class PDhafta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz: ");
		String name=sc.nextLine();
		System.out.println("Lutfen yasinizi giriniz: ");
		int age=sc.nextInt();
		System.out.println("Kiz iseniz 1'e erkek iseniz 2'ye basin");
		int cinsiyet=sc.nextInt();
		
		while(true) {
			if(age>=18&&age<=16) {
				break;
				
			}
			else if(cinsiyet==2) {
				break;
			}
			else if(name.toUpperCase().charAt(0)!='B') {
				break;
			}
			else {
				System.out.println("Evde Kal!");
				break;
			}
		}
		

	}

}
