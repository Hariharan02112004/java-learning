import java.lang.System;
import java.util.Scanner;

class trafficlight{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the light of the traffic light: ");
        String light=input.nextLine();
        if (light.equals("Red") || light.equals("red")){
            System.out.print("Stop");
        }
        else if (light.equals("Yellow") || light.equals("yellow")){
            System.out.print("Get ready");
        }
        else{
            System.out.print("Go");
        }    
    }
}