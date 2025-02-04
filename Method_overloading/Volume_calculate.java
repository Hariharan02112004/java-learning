/*Volume of Shapes
Create a class VolumeCalculator with overloaded calculateVolume() methods:

calculateVolume(int side) → Volume of a cube.
calculateVolume(int radius, int height) → Volume of a cylinder.
calculateVolume(double length, double width, double height) → Volume of a cuboid.
Call these methods in a MainClass.*/

import java.util.Scanner;
class Vol_calculate{
	void calculateVolume(int side){
		System.out.println("Volume of a cube: "+(side*side*side));
	}
	void calculateVolume(int radius, int height){
		System.out.println("Volume of a cylinder "+(3.14*radius*radius*height));
	}
	void calculateVolume(double length, double width, double height){
		System.out.println("Volume of a cuboid: "+(length*width*height));
	}
} 

class Volume_calculate{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Vol_calculate vol=new Vol_calculate();
		vol.calculateVolume(45);
		vol.calculateVolume(24,25);
		vol.calculateVolume(1.2d,22.1d,2.0);
	}
}