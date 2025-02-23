
import java.util.Scanner;
public class Reverse_words {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String sent=in.nextLine();
    String words[]=sent.split(" ");
    StringBuilder result=new StringBuilder();
    for(int i=0 ;i<words.length ;i++){
        StringBuilder rev=new StringBuilder(words[i]).reverse();
        result.append(rev);
        if(i<words.length-1){
            result.append(" ");
        }
    }
    System.out.print(result.toString());     
    }
}