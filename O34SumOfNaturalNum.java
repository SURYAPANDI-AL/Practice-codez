import java.util.Scanner;
public class O34SumOfNaturalNum {
	public static int largestDigit(int sum) {
		int lgDigit=0;
		while(sum!=0) {
			int remainder=sum%10;
			if(lgDigit<remainder) 
				lgDigit=remainder;
			sum=sum/10;
		}
		return lgDigit;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=(num*(num+1))/2;
		System.out.println("the sum of natural number until "+num+" is "+sum+".\nthe largest digit of the sum is "+(largestDigit(sum)));
		sc.close();
	}
}
