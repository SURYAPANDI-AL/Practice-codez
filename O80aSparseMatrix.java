import java.util.Scanner;

public class O80aSparseMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int m=sc.nextInt(),n=sc.nextInt(),count=0;
		int a[][]= new int[m][n];
		System.out.println("enter matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("matrix :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"	");
				if(a[i][j]==0)
					count++;
			}System.out.println();
		}
		System.out.println(count>(m*n)/2?"it's a Sparse Matrix":"it's not a Sparse Matrix");
		sc.close();
	}

}
