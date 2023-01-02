import java.util.Arrays;
import java.util.Scanner;
public class O63aLargeAndSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		int l=arr[0],s=arr[0];
		for(int i:arr) {
			l=(l<i)?i:l;
			s=(s>i)?i:s;
		}
		System.out.println("largest  number: "+l+"\nsmallest number: "+s);
	
		
		
		//method 2 sorting
		System.out.println("\n\n\n");
		int[] arr2=arr.clone();
		Arrays.sort(arr2);
		System.out.println("largest  number: "+arr2[arr.length-1]+"\nsmallest number: "+arr2[0]);
		
	}

}
