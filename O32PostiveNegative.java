import java.util.Scanner;
public class O32PostiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num>=0?num +" is a Positive number.":num+" is a Negative number.");
		sc.close();
	}
}
