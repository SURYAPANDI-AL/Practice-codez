import java.util.Scanner;
public class O56Pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),row=0,count=1;
		sc.close();
		for(int i=1;i<n;i++) {
			row=row+i;
			if(row>=n) {
				row=i;
				break;
			}
		}
		for(int i=1;i<=row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count++ +" ");
				if(count==n+1)
					break;
			}System.out.println();
		}
	}
}
