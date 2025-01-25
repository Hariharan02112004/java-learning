//get a number and check the given number is divisible by both 3 & 4 if so print Good Morning. If a number is divisible by only 4 but not 3 print Good Afternoon.If a number is divisible by only 3 but not 4 print Good Evening.Otherwise print Good Night

import java.util.Scanner;
public class Div_of_num{
	public static String div(int n){
		if(n%3==0 && n%4==0)
		return "Good Morning";
		else if(n%4==0 && n%3!=0)	
		return "Good Afternoon";
		else if(n%3==0 && n%4!=0)
		return "Good Evening";
		else
		return "Good Night";
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		String result=div(n);
		System.out.print(result);
	}
}