
import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a=d.nextInt(),r=0,reverse=0,m=a;
        d.close();
        while(a>0){
            r=a%10;
            reverse=reverse*10+r;
            a=a/10;
        }
        System.out.println(reverse);
        if(m==a)
        System.out.println("Palindrome");
        else{
            System.out.println("Not palindrome");
        }

        }
        }