import java.util.Scanner;
public class O25QandR {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Quotient:"+(num1/num2));
		System.out.println("Remainder:"+(num1%num2));
		sc.close();
	}
}
