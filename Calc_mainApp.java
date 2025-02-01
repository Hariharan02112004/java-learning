/*Class Interaction with Method Calls
Create:

Calculator → Has methods for addition, subtraction, multiplication, and division.
MainApp → Calls Calculator methods and prints results.*/

import java.util.Scanner;
class Calculator{
	int a,b;String c;
	void add(){
		System.out.print("The addition of the two number is "+(a+b));
	}
	void sub(){
		System.out.print("The subtraction of the two number is "+(a-b));
	}
	void mul(){
		System.out.print("The multiplication of the two number is "+(a*b));
	}
	void div(){
		if(b==0)
			System.out.print("Division by zero not allowed");
		else
			System.out.print("The division of the two number is "+(a/b));
	}
}
class Calc_mainApp{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Calculator c1=new Calculator();
		System.out.print("Enter the first integer: ");
		c1.a=in.nextInt();
		System.out.print("Enter the second integer: ");
		c1.b=in.nextInt();
		in.nextLine();
		System.out.print("Enter the Basic Mathematical Operations : ");
		c1.c=in.nextLine();
		if(c1.c.equalsIgnoreCase("Addition") || c1.c.equalsIgnoreCase("+") ){
			c1.add();
		}
		else if(c1.c.equalsIgnoreCase("SUBTRACTION") || c1.c.equalsIgnoreCase("-")){
			c1.sub();
		}
		else if(c1.c.equalsIgnoreCase("MULTIPLICATION") || c1.c.equalsIgnoreCase("*")){
			c1.mul();
		}
		else if(c1.c.equalsIgnoreCase("DIVISION") || c1.c.equalsIgnoreCase("/")){
			c1.div();
		}
		in.close();
	}
}