import java.util.Scanner;

public class sumofnum{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int N=scan.nextInt();
        int sum_of_n = N*((N+1)/2);
        System.out.print("Sum of numbers till "+N+" is "+sum_of_n);
    }
}