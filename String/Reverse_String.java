import java.util.Scanner;

public class Reverse_String{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=input.nextLine();
        String rev="";
        char ch;
        for(int i=0;i<str.length();i++){
                ch=str.charAt(i);
                rev=ch+rev;
        }
        System.out.println(rev);
    }

}