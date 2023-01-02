import java.util.Scanner;
public class O04BitwiseOperator {
	public static void main(String[] args) {
		System.out.println("\tFUNCTIONS OF BITWISE OPERATOR\nEnter Number1 and Number2:");
		Scanner sc =new Scanner(System.in);
		int number1,number2;
		number1=sc.nextInt();
		number2=sc.nextInt();
		System.out.println("Bitwise AND operator 	"+number1+" & "+number2+" = "+(number1&number2));
		System.out.println("Bitwise OR operator 	"+number1+" | "+number2+" = "+(number1|number2));
		System.out.println("Bitwise XOR operator 	"+number1+" ^ "+number2+" = "+(number1^number2));
		System.out.println("Bitwise LEFT SHIFT operator 	"+number1+" << 1 = "+(number1<<1));
		System.out.println("Bitwise RIGHT SHIFT operator 	"+number1+" >> 1 = "+(number1>>1));
		System.out.println("Bitwise NOT operator 	"+" ~ "+number2+" = "+(~number2));
		sc.close();
	}
}
