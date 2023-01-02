import java.util.Arrays;
import java.util.Scanner;

public class O86aPrintCharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of characters in array:");
		int n=sc.nextInt();
		char a[]=new char[n];
		for(int i=0;i<n;i++)
			a[i]=sc.next().charAt(0);
		//string method.
		System.out.println("\n\n\nstring method.");
		System.out.println(Arrays.toString(a));
		
		//value of method.
		System.out.println("\n\n\nvalue of method.");
		System.out.println(String.valueOf(a));
		
		//loop method.
		System.out.println("\n\n\nloop method.");
		for(int i=0;i<a.length;i++) 
				System.out.print(a[i]+"	");  
		sc.close();
	}

}
