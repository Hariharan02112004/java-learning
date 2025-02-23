import java.util.Scanner;
public class perfect_Squares {
 public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sqrt=(int)Math.sqrt(n);
    if(sqrt*sqrt == n)
    {
        System.out.print("perfect_Squares");
    }
    else
    {
        System.out.print("Not ");
    }

 }
}
