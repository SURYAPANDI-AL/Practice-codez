import java.util.Scanner;

public class O75aOddEvenArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Odd numbers : ");
		for(int i=0;i<n;i++)
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		System.out.println();
		System.out.print("Even numbers: ");
		for(int i=0;i<n;i++)
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		sc.close();

	}

}
