import java.util.Arrays;
import java.util.Scanner;
public class O61aReverseOrder {
	public static void main(String[] args) {
		///method 1 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		System.out.print("{ ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			if(i!=0)
				System.out.print(", ");
		}
		System.out.print(" }");
		
		//method 2 swap
		int arr2[]=arr.clone();
		for(int i=0;i<arr2.length/2;i++)
			arr2[i]=arr2[i]+arr2[arr2.length-1-i]-(arr2[arr2.length-1-i]=arr2[i]);
		System.out.println("\n\n"+Arrays.toString(arr2));
		
	}

}
