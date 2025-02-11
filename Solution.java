//Replace 0's with 1 and 1's with 0's
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner d=new Scanner(System.in);
        String str=d.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
    }
}