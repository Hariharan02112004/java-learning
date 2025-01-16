import java.lang.System;
import java.util.Scanner;

class loaneligible{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        double sal=scan.nextInt();
        System.out.print("Enter your age: ");
        int age=scan.nextInt();
        if(sal>=20000 || age<=25){
            System.out.println("Eligible for loan");
            System.out.print("Enter your loan amount: ");
            int loanamt=scan.nextInt();
            if (loanamt<=50000){
                System.out.print("Loan available");
            }
            else{
                System.out.print("Maximum loan amount is 50,000");
            }
        }
        else{
            System.out.print("Not eligible");
        }
        
    }
}