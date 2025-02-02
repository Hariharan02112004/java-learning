/*Using a Constructor in Multiple Classes
Create:

Book → Has title and author (initialized via constructor).
Library → Creates multiple Book objects and prints their details.*/

import java.util.Scanner;

class Book{
	String title;
	String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	void print(){
		System.out.println("The title of book is "+this.title+". The author is "+this.author);
	}
}
class Library_manage{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of books : ");
		int n=scan.nextInt();
		scan.nextLine();	
		Book[] b=new Book[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the title of the book: ");
			String title=scan.nextLine();
			System.out.println("ENter the author of the book: ");
			String author=scan.nextLine();
			b[i]=new Book(title,author);
		}
		System.out.println("Library Collection: ");
		for(int i=0;i<n;i++){
			b[i].print();
		}
		scan.close();
		
	}
}