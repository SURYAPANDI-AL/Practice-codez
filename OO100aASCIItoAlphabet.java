import java.util.Scanner;

public class OO100aASCIItoAlphabet {

	public static void main(String[] args) {
		//method 1-type casting.
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		if(n>=65&&n<=90) {
			System.out.println("method 1-type casting.");
			System.out.println((char)n);
		}
		sc.close();
		
		
		//method 2
		if(n>=65&&n<=90) {
			System.out.println("method 2-format.");
			System.out.format("%C", n);
		}
		System.out.println();
		//method 3
		if(n>=65&&n<=90) {
			System.out.println("method 3-printf");
			System.out.printf("%C", n);
		}
	}

}
