import java.util.Scanner;
public class O03DifferenceBetweenNumberAndReverse {
	public int reverseNumber(int number) {
		int reverseNumber=0,remainder;
		while(number!=0) {
			remainder=number%10;
			number=number/10;
			reverseNumber=reverseNumber*10+remainder;
		}
		return reverseNumber;
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int number,reverseNumber,difference;
		number=sc.nextInt();
		O03DifferenceBetweenNumberAndReverse obj=new O03DifferenceBetweenNumberAndReverse();
		reverseNumber=obj.reverseNumber(number);
		difference=number-reverseNumber;
		System.out.println(number+" - "+reverseNumber+" = "+difference);
		sc.close();
	}
}
