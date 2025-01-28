//Fibonacci Series
import java.util.Scanner;

public class Fibo_series{
	public static void fibo(int n1,int n2,int count){
		int n3;
		for(int i=2;i<count;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of series: ");
		int count=input.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" "+n2);
		fibo(n1,n2,count);		
	}
}
