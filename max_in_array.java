//Max number in a array
import java.util.Scanner;

public class max_in_array{
	public static int find_max(int arr[],int n){
		int max=arr[0];
		for(int i=0;i<n;i++){
				if(arr[i]>max){
					max=arr[i];
				}
		}
		return max;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements of array: ");		
		int n=in.nextInt();			
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int result=find_max(arr,n);
		System.out.print("Sum og array is : "+result);
	}
}
