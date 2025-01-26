//find number of vowels & consonants
import java.util.Scanner;
public class Char_count{
	public static void count(String s1){
		int vowels_count =0 , consonants_count=0;
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			vowels_count++;
			else if(ch>='a' && ch<='z')
			consonants_count++;
		}
	
		System.out.println("The numbers of vowels is: "+vowels_count);
		System.out.print("The numbers of consonats is: "+consonants_count);
	
	}
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1=scan.nextLine();

		count(s1);
		scan.close();
	}	
}