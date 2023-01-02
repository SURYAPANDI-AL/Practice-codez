import java.util.Arrays;
import java.util.Scanner;

public class O77aSortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[a.length];
		b=a.clone();
		//using sort.
		System.out.println("Before sorting the array: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("\n\n\nusing sort.");
		System.out.println("After sorting the array: "+Arrays.toString(a));
		sc.close();
		
		//using loop;
		System.out.println("\n\n\nusing loop.");
		for(int i=0;i<b.length;i++) {
			for(int j=i;j<b.length;j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j]-(a[j]=a[i]);
				}
			}
		}
		System.out.println("After sorting the array: "+Arrays.toString(a));
	}

}
