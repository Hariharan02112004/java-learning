//Print Vowels
import java.io.*;
import java.util.*;

public class Vowels {

    public static void main(String[] args) {
      Scanner d = new Scanner(System.in);
        String a = d.nextLine();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='o' || ch=='i'|| ch=='u'){
                System.out.print(ch);
            }
        }
    }