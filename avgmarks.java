import java.lang.System;
import java.util.Scanner;

class avgmarks{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the marks for first subject: ");
        int s1=scan.nextInt();
        System.out.print("Enter the marks for second subject: ");
        int s2=scan.nextInt();
        System.out.print("Enter the marks for third subject: ");
        int s3=scan.nextInt();
        System.out.print("Enter the marks for fourth subject: ");
        int s4=scan.nextInt();
        System.out.print("Enter the marks for fifth subject: ");
        int s5=scan.nextInt();
        int avg=(s1+s2+s3+s4+s5)/5;
        System.out.println("Average is "+avg);
        if((s1+s2+s3+s4+s5)/5<35){
            System.out.print("Additional class required");
        }
        else{
            System.out.print("you are good to go");
        }
    }
}

