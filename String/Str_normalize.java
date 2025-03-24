//Normalize String
//three ways to normalize a string
// 1. use replaceAll("\\s", "") method to replace spaces at first, last and inbetween letter
// 2. use trim() method to replace spaces at string beginning and ending
// 3. use trim().replaceAll("\\s+","") method to remove extra places inbetween the sentence 

import java.util.Scanner;
public class Str_normalize{
	public static String normal_str(String str){
		str=str.replaceAll("\\s+","");
		return str;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=in.nextLine();
		String result = normal_str(str);
		System.out.print("The normalized string is "+result);
		in.close();

	}
}
