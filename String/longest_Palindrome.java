//Find the longest palindrome substring in a string.

import java.util.Scanner;
public class longest_Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String substring=str.substring(i,j);
                StringBuffer str1=new StringBuffer(substring);
                str1=str1.reverse();
                
                if(substring.equals(str1.toString())&& substring.length()>=2){
                    System.out.print(substring);
                    break;
                    }
                                               
            }            
        }        
    }
}
