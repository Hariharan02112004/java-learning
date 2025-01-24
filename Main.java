// You are given an integer , you have to convert it into a string. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//can range between to inclusive.

import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a interger: ");
		int a=input.nextInt();
		String s1=Integer.toString(a);
		if(a==Integer.parseInt(s1)){
			System.out.println("Good Job");
		}
		else{
			System.out.println("Wrong answer");
		}
	}

}

