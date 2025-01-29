// Matrix Add & Sub & mul & div
import java.util.Scanner;

public class mat{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=input.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols=input.nextInt();
		int arr1[][]=new int[rows][cols];
		System.out.print("enter the elements of first matrix: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr1[i][j]=input.nextInt();
			}
		}
		int arr2[][]=new int[rows][cols];
		System.out.print("Enter the elements of second matrix: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr2[i][j]=input.nextInt();
			}
		}
		System.out.println("\nAddition of two matrix is ");
		int[][] result=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Subtraction: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix multiplication");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
/* check if any elment of the second matrix is 0. if 0 print dividsion by zero and break or return else divide arrat one and array 2
		System.out.println("Matrix division: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(arr2[i][j]!=0){
					result[i][j]=arr1[i][j]/arr2[i][j];
				}
				else{
					System.out.print("Division by zero occured in ("+i+","+j+")");
					return;
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();	
		}

		input.close();
	}
}