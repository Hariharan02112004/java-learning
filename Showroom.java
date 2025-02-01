/*Create two classes:

Car → Has attributes brand and model.
Showroom → Creates Car objects and displays their details using a method.*/
import java.util.Scanner;

class Car{
	String brand;
	int model;
	void print(){
		System.out.println("The name of the car brand is "+this.brand+" & the model number is "+this.model);
	}
}
class Showroom{
	public static void main(String[]args){
		Scanner s1=new Scanner(System.in);
		Car c1=new Car();
		Car c2=new Car();
		System.out.print("Enter first car model number : ");
		c1.model=s1.nextInt();
		s1.nextLine();
		System.out.print("Enter first car brand : ");
		c1.brand=s1.nextLine();
		System.out.print("Enter second car model number : ");
		c2.model=s1.nextInt();
		s1.nextLine();
		System.out.print("Enter second car brand : ");
		c2.brand=s1.nextLine();
		c1.print();
		c2.print();
	}
}