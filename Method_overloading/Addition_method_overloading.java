/*Addition of Numbers
Create a class MathOperations with overloaded add() methods:

add(int a, int b) → Adds two integers.
add(double a, double b) → Adds two double values.
add(int a, int b, int c) → Adds three integers.*/

import java.util.Scanner;

class Addition{
	void add(int a,int b){
		System.out.println("Addition of fisrt and second integer is "+(a+b));
	}
	void add(double a,double b){
		System.out.println("Addition of two double values is "+(a+b));
	}
	void add(int a,int b,int c){
		System.out.println("Addition of all three integer is "+(a+b+c));
	}
	
}
class Addition_method_overloading{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Addition Ad=new Addition();
		System.out.print("Enter first number: ");
		int a=input.nextInt();
		System.out.print("Enter second number: ");
		int b=input.nextInt();
		System.out.print("Enter third number: ");
		int c=input.nextInt();
		System.out.print("Enter first double valus: ");
		double a1=input.nextDouble();
		System.out.print("Enter second double valus: ");
		double a2=input.nextDouble();
		Ad.add(a,b);
		Ad.add(a,b,c);
		Ad.add(a1,a2);
	}
}