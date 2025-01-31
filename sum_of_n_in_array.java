//sum of all elements in a array
import java.util.Scanner;

public class sum_of_n_in_array{
	public static int sum(int arr[],int n){
		int sum_n=0;
		for(int i=0;i<n;i++){
			sum_n+=arr[i];
		}
		return sum_n;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements of array: ");		
		int n=in.nextInt();			
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int result=sum(arr,n);
		System.out.print("Sum og array is : "+result);
	}
}
