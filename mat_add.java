//Matrix Addition

import java.util.Scanner;

public class mat_add{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row=input.nextInt();
		System.out.print("Enter number of colums: ");
		int cols=input.nextInt();
		System.out.println("Matrix Addition");
		int[][] mat1=new int[row][cols];
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				mat1[i][j]=input.nextInt();
			}
		}
		printMatix(mat1);

	}
}