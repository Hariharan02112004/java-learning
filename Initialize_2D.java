//Creating a 2D Array
import java.util.Scanner;
public class Initialize_2D{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row=input.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols=input.nextInt();
		int[][] arr=new int[row][cols];
		System.out.println("Enter the values of two dimwnsional array: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println("The entered 2D array is ");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		input.close();
	}
}
