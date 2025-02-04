import java.util.Scanner;

public class char_Occurence{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=input.nextLine();
        int count=0;
        System.out.print("Enter the targeted character: ");
        char ch=input.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i))
                count++;
        }
        System.out.println("The char "+ch+" has occured "+count+" times");
    }
}