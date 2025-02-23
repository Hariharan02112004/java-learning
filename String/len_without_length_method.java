import java.util.Scanner;
public class len_without_length_method {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("String is ");
        String str=in.nextLine();
        int length=0;
        for(int i=0;i>=0;i++){
            try {
                str.charAt(i);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        System.out.println(length);
    }
}
