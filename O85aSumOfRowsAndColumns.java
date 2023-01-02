import java.util.Arrays;
import java.util.Scanner;

public class O85aSumOfRowsAndColumns {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of rows and columns:");
		int m=sc.nextInt(),n=sc.nextInt();
		int a[][]=new int[m][n];
		int ta[][]=new int[n][m];
		System.out.println("enter the value of elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) 
				a[i][j]=sc.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println();
		}    
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++) 
				ta[i][j]=a[j][i];
		for(int i=0;i<m;i++) {
			int sum=Arrays.stream(a[i]).sum();
			System.out.println("\nROW "+(i+1)+":"+sum);
		}
		for(int i=0;i<n;i++) {
			int sum=Arrays.stream(ta[i]).sum();
			System.out.println("\nCOLUMN "+(i+1)+":"+sum);
		}
		sc.close();
	}

}
