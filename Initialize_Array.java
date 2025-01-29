// use traditional method to get a array from the user
//Stream method() is used to give inputs directly 
import java.util.Scanner;                                                                                                                                                                                                                               
public class Initialize_Array{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number of elements: ");
		int n =input.nextInt();
		System.out.print("Enter "+n+" number of elements: ");
		int[] arr0=new int[n];
		for(int i=0;i<n;i++)
			arr0[i]=input.nextInt();
		System.out.println("IntStream.range() method");
		int arr[]=java.util.stream.IntStream.range(1,11).toArray();
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println();
		System.out.println("IntStream.rangeClosed() method");
		int arr1[]=java.util.stream.IntStream.rangeClosed(1, 10).toArray();

		for(int i:arr1)
			System.out.print(" "+i);
		System.out.println();
		System.out.println("IntStream.of() method");
		int arr2[]=java.util.stream.IntStream.of(1,2,3,4,5,6,7,8,9,10).toArray();
		for(int i:arr2)
			System.out.print(" "+i);
	}	
}