import java.util.Scanner;

public class O87aCharArrayToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of characters in array:");
		int n=sc.nextInt();
		char a[]=new char[n];
		for(int i=0;i<n;i++)
			a[i]=sc.next().charAt(0);
		System.out.println(String.valueOf(a));
		sc.close();

	}

}
