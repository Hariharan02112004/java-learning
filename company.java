/* Employee and Company
Create:

Employee → Has name, salary, and designation.
Company → Creates multiple Employee objects and prints details.*/

import java.util.Scanner;

class Emp{
	String name;
	int sal;
	String Designation;
	void disp(){
		System.out.println("Employee name: "+this.name+"\nEmployee Salary: "+this.sal+"\n Employee Desination is: "+this.Designation);
	}	
}
class company{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of employee: ");
		int n=in.nextInt();
		in.nextLine();
		Emp[] ep=new Emp[n];
		for(int i=0;i<n;i++){
			ep[i]= new Emp();
			System.out.println("Enete employee name: ");
			ep[i].name=in.nextLine();
			System.out.println("Enter employee salary: ");
			ep[i].sal=in.nextInt();
			in.nextLine();
			System.out.println("ENter desination of the employee: ");
			ep[i].Designation=in.nextLine();
		}		
		System.out.println("----Employee Details ----");
		for(int i=0;i<n;i++){
			ep[i].disp();
		}
		in.close();
	}
}
