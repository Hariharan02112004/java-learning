/* Basic Method Overriding
Create a class called Shape with a method area(). Create two subclasses Circle and Rectangle that override the area() method to calculate the area of a circle and rectangle respectively. Write a program that demonstrates method overriding.*/

import java.util.Scanner;

class Shape{
	void print(){
		System.out.println("----Calculating Area----");
	}
}
class Circle extends Shape{
	void area(double rad){
		System.out.println("The area of circle is: "+(3.14*rad*rad));
	}
}
class rectangle extends Shape{
	void area(int len, int bre){
		System.out.println("The area of rectangle is: "+(len*bre));

	}
}
class Area_Method_override{
	public static void main(String[]args){
 	Scanner input=new Scanner(System.in);
	Shape sh=new Shape();
	sh.print();
	Circle cir=new Circle();
	cir.area(3);
	rectangle rec=new rectangle();	
	rec.area(12,24);
	}
}

