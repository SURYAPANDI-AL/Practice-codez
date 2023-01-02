import java.util.Scanner;
public class O16Evaluate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a,b,c:");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		double root1 = 0,root2 = 0,m=(b*b)-(4*a*c);
		if(m>0) {
			m=Math.sqrt(m);
			root1=(-b+m)/(2*a);
			root2=(-b-m)/(2*a);
		}
		else if (m==0) {
			root1=root2=-b/(2*a);
			
		}
		else {
			System.out.println("roots are not real.");
		}
		if(m>=0) {
			int x=(int) ((a*root1*root1)+(b*root1)+c);
			int y=(int) ((a*root2*root2)+(b*root2)+c);
			if(x==0||y==0)
				System.out.println("ax^2+bx+c=0");
		}
		else
			System.out.println("ax^2+bx+c!=0");
		sc.close();
	}
}
