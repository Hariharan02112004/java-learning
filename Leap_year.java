//Leap year
import java.util.Scanner;
public class Leap_year{
	public static String leap(int n){
		if(n%4==0 && n%100!=0 || n%400==0)
		return "Leap Year";
		else
		return "Not Leap Year";
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int a=in.nextInt();
		String result=leap(a);
		System.out.print(result);
	}

}