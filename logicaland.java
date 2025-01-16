import java.lang.System;
import java.util.Scanner;
public class logicaland{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=scan.nextInt();
        if (a%3==0 && a%5==0)
        {
            System.out.print("Divisible by both 3 and 5");
        }
        else{
            System.out.print("Not divisible by both 3 and 5");
        }
    }
}