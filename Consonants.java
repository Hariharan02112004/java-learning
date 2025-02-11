//Exchange the consonant to &

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String s=d.nextLine();
        int i;
        d.close();
        for(i=0;i<s.length();i++){
            if(!(s.charAt(i)=='a'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='u')) {
                System.out.print("&");
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}