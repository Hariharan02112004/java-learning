/*String concepts
1. String compare using compareTo() check equals
2. String not  equal using compareTo() check not equals
3. Concating two Strings
4. Check two strings using equals() method
5. check two strings using equalsIgnoreCase() method
6. find length using length() method
7. replace a single char in string using replace() method
8. Split a string using delimiter
9. get a substring and store it in  a new String*/

import java.util.Scanner;

public class str_methods{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String s1=scan.nextLine();
		System.out.print("Enter the second string: ");
		String s2=scan.nextLine();
//1. compareTo() method prints 0 if(str1==str2) and prints +ve number if (str1>str2) and prints -ve number if(STr1<str2)
		int a=s1.compareTo(s2);
		if(a==0){
			System.out.println("Same String using compareTo method");
		}
		else
			System.out.println("Not Same String using compareTo method");
//2. if compareTo() is not equal to 0 then the strings are not equal( if(s1.compareTo(s2)!=0) then not same
		String s3=s1.concat(s2);
//3. Check two strings using equals() method
		if(s1.equals(s2)){
			System.out.println("Same String with case sensitive");
		}
		else
			System.out.println("Not Same String with case sentitive");
//4. Check two strings using equalsIgnorecase() method. this is done without case sensitive
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Same String without case sensitive");
		}
		else
			System.out.println("Not Same String even without case sentitive");
//5. concate s1 and s2 Then store it in s3
		System.out.println("First String concatenated with second string is "+s3);
//6. Find length of s1 & s2
		int len1=s1.length();
		int len2=s2.length();
		System.out.println("Length of String 1 is "+len1+" & length of string 2 is "+len2);
//7. replace a with h using replace() method
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch=='a')
			s1=s1.replace('a','h');
		}
		System.out.println("a is replace with h : "+s1);
//8. split the string using delimeter and it is given as a array so that can be printed 
		String[] s4=s2.split(" ");
		for(int i=0;i<s4.length;i++)
			System.out.println(s4[i]);
//9. getting a substring from s3
		s3=s3.substring(3);
		System.out.print("The substring from string 3 is "+s3);
			
	}
}


