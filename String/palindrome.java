import java.util.Scanner;

public class palindrome{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=input.nextLine();
        String temp=str;
        char ch;
        String rev="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        if(temp.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindorme");
        }

    }
}