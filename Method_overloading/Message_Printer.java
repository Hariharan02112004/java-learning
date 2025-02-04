/*Displaying Messages
Create a class MessagePrinter with overloaded printMessage() methods:

printMessage(String message) → Prints a simple message.
printMessage(String message, int times) → Prints the message multiple times.
printMessage(String message, boolean uppercase) → Converts message to uppercase if true.*/

import java.util.Scanner;

class Display_Statement{
	void printMessage(String message){
		System.out.println(message);
	}
	void printMessage(String message,int times){
		for(int i=0;i<times;i++){
			System.out.println(message);
		}
	}
	void printMessage(String message,boolean uppercase){
		if(uppercase){
			System.out.print(message.toUpperCase());
		}
	}
}

class Message_Printer{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Display_Statement print=new Display_Statement();
		System.out.print("Enter the message: ");
		String str=input.nextLine();
		System.out.print("Enter how many times message needed to print: ");
		int ti=input.nextInt();
		boolean uppercase=true;
		print.printMessage(str);
		print.printMessage(str,ti);
		print.printMessage(str,uppercase);		
	}
}