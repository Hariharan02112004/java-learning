import java.lang.System;
import java.util.Scanner;

public class logicalor{
    public static void main(String[]args){
        boolean cricket=true;
        boolean football=true;
        if(cricket || football){
            System.out.print("Play");
        }
        else{
            System.out.print("Don't play");
        }
    }
}