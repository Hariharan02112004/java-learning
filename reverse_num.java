import java.util.Scanner;

public class reverse_num {

    public static void main(String[] args) {
       Scanner d = new Scanner(System.in);
       int a=d.nextInt(),i,r,reverse=0;
        while(a>0){
            r=a%10;
            reverse=reverse*10+r;
            a=a/10;
        }
        System.out.println(reverse);
    }
}