import java.util.Scanner;
public class O41CopyArray {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int num=sc.nextInt();
		int arr1[]=new int[num];
		int arr2[]=new int[num];
		for(int i=0;i<num;i++) {
			arr1[i]=sc.nextInt();
			arr2[i]=arr1[i];
		}
		System.out.println("Elements in first array");
		for(int i=0;i<num;i++) 
			System.out.print(arr1[i]+" ");
		System.out.println("\nElements in second array");
		for(int i=0;i<num;i++) 
			System.out.print(arr2[i]+" ");	
		sc.close();
	}
}
