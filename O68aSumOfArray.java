import java.util.Arrays;
import java.util.Scanner;

public class O68aSumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		//array built in method
		System.out.println("\n\nArray built in method.");
		int sum=Arrays.stream(a).sum();
		System.out.println("sum of array: "+sum);
		sc.close();
		
		//looping method.
		System.out.println("\n\n\n\nlooping method.");
		int sum1=0;
		for(int i=0;i<n;i++)
			sum1=sum1+a[i];
		System.out.println("sum of array: "+sum1);
	}

}
