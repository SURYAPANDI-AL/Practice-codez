import java.util.Scanner;

public class O74aMatrixProduct {
	public static void print(int[][]a,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		}    
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int m=sc.nextInt(),n=sc.nextInt();
		System.out.println("first mat column=sec mat row ;\nenter the  columns of second matrix");
		int n2=sc.nextInt();
		int a[][]= new int[m][n];
		int b[][]= new int[n][n2];
		int c[][]=new int[a.length][a[0].length];
		System.out.println("first matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("second matrix elements:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n2;j++)
				b[i][j]=sc.nextInt();
		for(int i=0;i<m;i++)
			for(int j=0;j<n2;j++)
				for(int k=0;k<n;k++)
				c[i][j]+=a[i][j]*b[k][j];             
		System.out.println("first matrix:"); print(a,m,n);
		System.out.println("second matrix:"); print(b,n,n2);
		System.out.println("result matrix:"); print(c,m,n2);
		sc.close();
	}

}
