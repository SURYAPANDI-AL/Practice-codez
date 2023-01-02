import java.util.Scanner;

public class O84aMatrixOddAndEvenFrequency {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of rows and columns:");
		int m=sc.nextInt(),n=sc.nextInt(),c1=0,c2=0;
		int a[][]=new int[m][n];
		System.out.println("enter the value of elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]%2==0)
					c1++;
				else 
					c2++;
			}
		System.out.print("\nEven elements: "+c1);
		System.out.print("\n\nodd elements : "+c2);

		sc.close();
	}

}
