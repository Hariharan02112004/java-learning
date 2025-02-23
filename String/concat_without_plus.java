import java.util.Scanner;
public class concat_without_plus {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str=in.nextLine();
        System.out.print("Enter second string: ");
        String str2=in.nextLine();
        StringBuilder result=new StringBuilder();
        result.append(str);
        result.append(" ");
        result.append(str2);
        System.out.println(result.toString());
    }
    
}
