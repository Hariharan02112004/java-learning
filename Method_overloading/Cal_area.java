/* Calculate Area (Different Shapes)
Create a class AreaCalculator with overloaded calculateArea() methods:

calculateArea(int side) → Calculates area of a square.
calculateArea(int length, int breadth) → Calculates area of a rectangle.
calculateArea(double radius) → Calculates area of a circle.*/

import java.util.Scanner;
class Area{
	int calculateArea(int side){
		return 4*side;
	}
	int calculateArea(int length,int breadth){
		return length*breadth;
	}
	double calculateArea(double radius){
		return 3.14*radius*radius;
	}
}

class Cal_area{
	public static void main(String[]args){	
	Scanner input=new Scanner(System.in);
	Area a=new Area();
	int result=a.calculateArea(5,9);
	System.out.println("The area of rectangle is "+result);
	int result1=a.calculateArea(5);
	System.out.println("The area of square is "+result1);
	double result2=a.calculateArea(5.13);
	System.out.println("The area of circle is "+result2);	
	}
}