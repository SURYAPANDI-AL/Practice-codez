import java.util.Arrays;
import java.util.Scanner;
public class O69aRightRotate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[a.length];
		System.out.println("enter the number of shifts:");
		int s=sc.nextInt();
		int shift=s % (a.length);
		System.arraycopy(a, a.length-shift, b, 0, shift);
		System.arraycopy(a,0, b, shift, a.length-shift);
		a=b.clone();
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
