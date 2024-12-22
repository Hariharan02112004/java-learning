import java.util.Scanner;

class add{
    public static void main(String[]args){
        Scanner hari=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=hari.nextInt();
        System.out.print("Enter the Second number: ");
        int b=hari.nextInt();
        int result=a+b;
        System.out.print("Addition of two numbers: "+result);
        
    }
}