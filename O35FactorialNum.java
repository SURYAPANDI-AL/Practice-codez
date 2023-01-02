import java.util.Scanner;
public class O35FactorialNum {
	public static long factorial(int num) {
		int i;
		long result=1;
		for(i=num;i>0;i--)
			result=result*i;
		return result;
	}
	public static int sum(long result) {
		int sum=0;
		while(result!=0) {
			sum=(int) (sum+(result%10));
			result=result/10;
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long result=factorial(num);
		System.out.println("Factorial of "+num+" is "+result+"and the factorial number's sum of digits is "+(sum(result)));
		sc.close();
	}
}
