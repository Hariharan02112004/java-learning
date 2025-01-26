//Find Square of a number
import java.util.Scanner;
public class Square_num{
	public static int square(int n){
		return n*n;
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		int result=square(n);
		System.out.print("The Square of "+n+" is "+result);
		input.close();
	}
}