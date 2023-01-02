import java.util.Scanner;

public class O82aLowerTriangleMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns matrix should be a square matrix");
		int n=sc.nextInt();
		int a[][]= new int[n][n];
		System.out.println("enter the matrix elements:");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("matrix :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		}
		System.out.println("\n\n\nLower triangle matrix :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print(a[i][j]+"	");
				else
					System.out.print("0	");
			}System.out.println();
		}sc.close();
	}

}
