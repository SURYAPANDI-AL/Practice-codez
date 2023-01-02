import java.util.Scanner;

public class O98aCapitalLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char in=sc.next().charAt(0);
		//using printf.
		System.out.println("\n\n\nusing printf");
		System.out.printf("%C",in);
		sc.close();
		//using format
		System.out.println("\n\n\nusing format");
		System.out.format("%C",in);
		
		//using toUpperCase.
		System.out.println("\n\n\nusing toUpperCase.");
		String str=String.valueOf(in);
		System.out.println(str.toUpperCase());
		
	}

}
