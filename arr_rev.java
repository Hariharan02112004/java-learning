//Reverse of a array using for loop
import java.util.Scanner;

public class arr_rev{
	public static void rev(int[] arr,int n){
		int left=0,right=n-1;
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}

	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of elements of a array: ");
		int n=in.nextInt();
		System.out.println("Enter "+n+ " number of elements for the array: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			 arr[i]=in.nextInt();
		}
		rev(arr,n);
		for(int i:arr){
			System.out.print(i+" ");
		}
		
	}	
}