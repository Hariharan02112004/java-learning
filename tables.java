import java.lang.System;
import java.util.Scanner;
class tables{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the table which should be printed: ");
        int n=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}