//Convert a string from camelCase to snake_case.
/*Initialize an empty StringBuilder to store the final result in snake_case.

Iterate through each character of the CamelCase string.

Check if the current character is uppercase:

If it is, append an underscore (_) to the result (if it's not the first character).
Convert the uppercase character to lowercase and append it to the result.
If the character is lowercase, simply append it directly to the result.

Return the resulting string as the final snake_case string. */
import java.util.Scanner;
public class Case_change {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string in camelCase: ");
        String str=in.nextLine();
        StringBuilder str1=new StringBuilder();
        in.close();
        for(int i=0;i<str.length();i++){  
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                if(i>0){
                    str1.append('_');
                }
                str1.append(Character.toLowerCase(ch));                
            }else{
                str1.append(ch);
            }
        }
        System.out.print("String is "+str1.toString());
    }
    
}
