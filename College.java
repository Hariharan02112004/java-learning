/* Multiple Objects in Different Classes
Create:

Student → Has name, id, and a method to display details.
College → Creates multiple Student objects and prints their details*/

import java.util.Scanner;
class Students{
	String name;
	int id;
	void print(){
		System.out.println("Student name is "+this.name+" & id no is "+this.id);
	}

}
class College{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		System.out.print("Enter student 1 name: ");
		s1.name=in.nextLine();
		System.out.print("Enter student 1 id number: ");
		s1.id=in.nextInt();
		in.nextLine();
		System.out.print("Enter student 2 name: ");
		s2.name=in.nextLine();
		System.out.print("Enter student 2 id number: ");
		s2.id=in.nextInt();
		in.nextLine();
		System.out.print("Enter student 3 name: ");
		s3.name=in.nextLine();
		System.out.print("Enter student 3 id number: ");
		s3.id=in.nextInt();
		s1.print();
		s2.print();
		s3.print();
	}
}