import java.lang.System;
import java.util.Scanner;

public class stringcompare{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the result of RCB: ");
        String RCB=scan.nextLine();
        if (RCB.equals("Win"))
        {
            System.out.print("Ee sala cup Namdhey!!!!");
        }
        else
        {
            System.out.print("cup illa");
        }
    }
}