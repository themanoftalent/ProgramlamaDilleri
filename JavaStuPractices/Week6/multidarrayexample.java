package ders6;

import java.util.Scanner;

public class multi_d_array_example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("matrisin indisleri giriniz");
		int [][] matrix= new int[3][3];
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println(" ");
		}
		

	}

}