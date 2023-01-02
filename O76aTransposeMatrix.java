import java.util.Scanner;

public class O76aTransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int m=sc.nextInt(),n=sc.nextInt();
		int a[][]= new int[m][n];
		System.out.println("enter matrix elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		System.out.println("matrix before transpose:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		}
		System.out.println("\n\n\nusing loop.");
		System.out.println("matrix after transpose:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(a[j][i]+"	");
			System.out.println();
		}
		sc.close();
		
		//using swap.
		System.out.println("\n\n\nusing swap.");
		System.out.println("matrix after transpose:");
	        for (int i = 0; i < m; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int temp = a[i][j];
	                a[i][j] = a[j][i];
	                a[j][i] = temp;
	            }
	        }

	        System.out.print("Modified matrix is \n");
	        for (int i1 = 0; i1 < m; i1++) {
	            for (int j1 = 0; j1 < n; j1++)
	                System.out.print(a[i1][j1] + " ");
	            System.out.print("\n");
	        }
	}

}
