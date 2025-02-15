import java.util.Scanner;
public class remove_dup {
    public static String rev(String str){
        StringBuffer str1=new StringBuffer(str);
        for(int i=0;i<str1.length();i++){            
            for(int j=i+1;j<str1.length();j++){
                char ch=str1.charAt(i);
                char ch1=str1.charAt(j);
                if(ch==ch1){
                    str1.deleteCharAt(j);
                    j--;
                }
            }
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=in.nextLine();
        String result=rev(str);

        System.out.print("After deleting "+result);

    }
}
