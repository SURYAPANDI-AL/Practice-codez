import java.util.Scanner;
public class O31Roots {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		double root1,root2,m=(b*b)-(4*a*c);
		if(m>0) {
			m=Math.sqrt(m);
			root1=(-b+m)/(2*a);
			root2=(-b-m)/(2*a);
			System.out.format("root 1:%.2f root2:%.2f",root1,root2);
		}
		else if (m==0) {
			root1=root2=-b/(2*a);
			System.out.format("root 1:%.2f root2:%.2f",root1,root2);
			
		}
		else {
			m=Math.sqrt(-m)/(2*a);
			root1=root2=-b/(2*a);
			System.out.format("root 1:%.2f+i%.2f root2:%.2f-i%.2f",root1,m,root2,m);
		}
		sc.close();
	}
}
