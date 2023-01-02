import java.util.Arrays;
import java.util.Scanner;
public class O64aCopyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a1[]=new int[n];
		for(int i=0;i<n;i++)
			a1[i]=sc.nextInt();
		sc.close();
		int a2[]=a1.clone();   //using clone()method
		System.out.println("first array:\n");
		for(int i:a1)
			System.out.print(i+" ");
		System.out.println("\n\n\ncopied array\n\n\n clone() method-1");
		
		for(int i:a2)
			System.out.print(i+" ");
		
		
		//array copy
		System.out.println("\n\n\narray copy method-2");
		int a3[]=new int[a1.length];
		System.arraycopy(a1, 0, a3, 0, n);
		System.out.println(Arrays.toString(a3));
		
		
		//copy of 
		System.out.println("\n\n\ncopyof() method-3");
		int a4[]=Arrays.copyOf(a1, n);
		System.out.println(Arrays.toString(a4));
		
		//copy of range
		System.out.println("\n\n\ncopyofrange() method-4");
		int a5[]=Arrays.copyOfRange(a1, 0, n);
		System.out.println(Arrays.toString(a5));
	}
}
