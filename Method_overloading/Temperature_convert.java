/*Converting Temperature
Create a class TemperatureConverter with overloaded convert() methods:

convert(double celsius) → Converts Celsius to Fahrenheit.
convert(double fahrenheit, boolean toCelsius) → Converts Fahrenheit to Celsius if toCelsius is true.
Call these methods in a MainClass*/

import java.util.Scanner;

class convert_tem{
	double convert(double celsius){
		return (9.0/5.0)*celsius+32;
	}
	void convert(double fahrenheit, boolean toCelsius){
		if(toCelsius){	
			System.out.print("Celcius is "+(5.0/9.0)*(fahrenheit-32));
		}
	}
}
class Temperature_convert{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		convert_tem con_tem = new convert_tem();	
		System.out.print("Enter the temperature in celcius: ");
		double celc=scan.nextDouble();
		double result =con_tem.convert(celc);
		System.out.println("Fahrenheit is "+result);
		Boolean a=true;
		con_tem.convert(result,a);
	}	
}