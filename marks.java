import java.lang.System;
import java.util.Scanner;
//get input marks and find pass or fail
//condition(above 35 marks pass)
class marks{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks=scan.nextInt();
        if (marks>34)//34 is given cause when we give 35 and the mark taken is 35 the output will be printed as fail
        {
            System.out.print("Pass");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}