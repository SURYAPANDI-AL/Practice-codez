import java.util.Scanner;
public class O51ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int reversenum=0;
		while(number!=0) {
			int remainder=number%10;
			reversenum=reversenum*10+remainder;
			number=number/10;
		}
		System.out.println("The number in reverse order is : "+reversenum);
	sc.close();
	}
}
