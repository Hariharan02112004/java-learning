import java.util.Scanner;

public class use_compareTo{
	public static int add(String a, String b){
		a=a.toLowerCase();
		a=a.trim().replaceAll("\\s","");
		b=b.toLowerCase();
		b=b.trim().replaceAll("\\s","");
		return a.compareTo(b);
	} 
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1=in.nextLine();
		System.out.print("Enter a string: ");
		String s2=in.nextLine();
		int result=add(s1,s2);
		System.out.println("The result is: "+result);
		if(result==0)
		System.out.print("Same String");
		else
		System.out.print("different String");
		in.close();		
	}
	
}