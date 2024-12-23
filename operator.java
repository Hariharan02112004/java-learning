import java.lang.System;
import java.util.Scanner;

public class operator{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if(num1<num2)
        {
            System.out.print("Greatest number is: "+num2);
        }
        else if(num1>num2)
        {
            System.out.print("Greatest number is: "+num1);
        }
        else
        {
            System.out.print("Both are equal");
        }
    }
}