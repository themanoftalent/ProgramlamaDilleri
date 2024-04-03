import java.util.Scanner;
public class multidArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=3;
		int[][] multida= new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.println(i+" satir "+j+" sutundaki sayiyi girin: ");
				multida[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				System.out.print(multida[i][j]);
	
			}
			System.out.println();
		}
	

	}

}