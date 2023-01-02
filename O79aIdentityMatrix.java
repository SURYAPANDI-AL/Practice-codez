import java.util.Arrays;
import java.util.Scanner;

public class O79aIdentityMatrix {
	public static void method(int [][]a,int n) {
		System.out.println("\n\n\nmethod1:");
		int sum=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				sum=sum+a[i][j];
				if(a[i][j]==1)
					sum=sum+a[i][i];
			}
		System.out.print("the given matrix is");
		System.out.print(sum==(a.length*2)?" an identity matrix":" not an identity matrix");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns matrix should be a square matrix");
		int n=sc.nextInt(),count=0;
		int a[][]= new int[n][n];
		System.out.println("enter the matrix elements:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("matrix :");
		for(int i=0;i<n;i++) {
			int sum=Arrays.stream(a[i]).sum();
			if(a[i][i]==1&&a[i][i]==sum)
				count++;
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		}
		method(a,n);
		System.out.println("\n\n\nmethod2:");
		System.out.print("the given matrix is");
		System.out.print(count==a.length?" an identity matrix":" not an identity matrix");
		sc.close();
	}

}
