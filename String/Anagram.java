import java.util.Arrays;
import java.util.Scanner;
public class Anagram{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=scan.nextLine();
        System.out.print("Enter the second String: ");
        String str2=scan.nextLine();
        str=str.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str.length()!=str2.length()){
            System.out.print("Not Anagram");
            return;
        }
        char[] ch1=str.toCharArray();
        char [] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
             System.out.print("Anagrams");
        }
        else{
             System.out.print("Not Anagrams");
        }
        scan.close();
    }
}