import java.util.Scanner;

public class ternaryop{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter frst number: ");
        int a=in.nextInt();
        System.out.print("Enter second number: ");
        int b=in.nextInt();
        String result=a>b?a+" is greater":b+" is greater";
        System.out.print(result);
    }
}