import java.util.Scanner;
public class O27Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("Before swap: a = "+a+" b = "+b);
		a=a+b-(b=a);
		System.out.println("After  swap: a = "+a+" b = "+b);
		sc.close();
	}
}
