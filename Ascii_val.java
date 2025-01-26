//Finding ascii values
import java.util.Scanner;
public class Ascii_val{
	public static void val(String str){
		str=str.trim().replaceAll("\\s+","");
		for( int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		int asci=(int)ch;
		System.out.println("Ascii val of "+ch+" is "+asci);
		}

		
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = input.nextLine();
		val(str);
		input.close();
	}
}