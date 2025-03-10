// All methods in StringBuffer
import java.util.Scanner;

public class string_buffer{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.print("Enter a String: ");
		sb.append(scan.nextLine());// use append method to get StringBuffer as input
		System.out.println("The stringBuffer is : "+sb);
		int len=sb.length();// using length method to find the length of the StringBuffer
		System.out.println("The length of  stringBuffer is : "+len);
		sb.insert(len," This is inserted");// using insert statement to insert something
		System.out.println("The new stringBuffer after insert method is : "+sb);
		int len2=sb.length();
		System.out.println("The length of stringNuffer after insert  is : "+len2);
		sb.delete(len ,len2);//The inserted statement is deleted using delete method
		System.out.println("The stringBuffer after deleting is : "+sb);
		sb.replace(0,len,"This is the replaced stringbuffer");//we are replacing the original String
		System.out.println("The stringBuffer after replaced is : "+sb);
		sb=sb.reverse();//reverse the string using reverse() method
		System.out.println("The reversed stringBuffer is : "+sb);
		
		
	}
}