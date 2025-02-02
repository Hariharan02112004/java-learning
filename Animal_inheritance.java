/* Animal Inheritance (Basic OOP Concept)
Create:

Animal → Has name and sound().
Dog and Cat classes inherit Animal and override sound().
MainClass → Creates Dog and Cat objects and calls sound().*/

import java.util.Scanner;
class Animal{
	String name;
	void sound(){
		System.out.println("All animals make sound");
	}
}
class Dog extends Animal{
	@Override
	void sound(){
		System.out.println("The sound of Dog is \"bow bow\"");
	}
}
class Cat extends Animal{
	@Override
	void sound(){
		System.out.println("The sound of cat is \"Meoe\"");
	}
}
class Animal_inheritance{
	public static void main(String[]args){
		Animal a1=new Animal();
		Dog d1=new Dog();
		Cat c1=new Cat();
		a1.sound();
		d1.sound();
		c1.sound();
	}
}