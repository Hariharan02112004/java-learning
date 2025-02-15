import java.util.Scanner;
public class Only_digits {
    public static String only_Digi(String str){
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).matches("[0-9]+"))
                return "is Digit";
        }
        return "Not Digit";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String result=only_Digi(str);
        System.out.println(result);
    }
    
}
