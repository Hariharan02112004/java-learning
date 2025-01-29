//Matrix Addition

import java.util.Scanner;

public class mat_add{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row=input.nextInt();
		System.out.print("Enter number of colums: ");
		int cols=input.nextInt();
		System.out.println("ENTER FIRST MATRIX: ");
		int[][] mat1=new int[row][cols];
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				mat1[i][j]=input.nextInt();
			}
		}
		System.out.println("ENTER SECOND MATRIX: ");
		int[][] mat2=new int[row][cols];
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				mat2[i][j]=input.nextInt();
			}
		}
		int result[][]=new int[row][cols];
		System.out.println("Matrix Addition");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}
}
