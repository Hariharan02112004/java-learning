import java.lang.System;
import java.util.Scanner;

public class gamescore{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score=input.nextInt();
        if(score<50){
            System.out.print("You need to improve.");
        }
        else if(score >=50 && score<=70){
            System.out.print("Good job!");
        }
        else {
            System.out.print("Excellent performance!");
        }
    }
}