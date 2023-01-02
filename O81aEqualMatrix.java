import java.util.Scanner;

public class O81aEqualMatrix {
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
		int m=sc.nextInt(),n=sc.nextInt(),count=0;
		int a[][]= new int[m][n];
		int b[][]= new int[m][n];
		System.out.println("enter first matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("enter second matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
				if(a[i][j]==b[i][j])
					count++;
			}
		System.out.println("first matrix:"); print(a,m,n);
		System.out.println("second matrix:"); print(b,m,n);
		System.out.println(count==m*n?"matrix1=matrix2":"matrix1!=matrix2");
		sc.close();
	}

}
