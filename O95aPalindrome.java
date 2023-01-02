import java.util.Scanner;

public class O95aPalindrome {
	public static void palindrome(String s1) {
		//using string builder.
		StringBuilder sb=new StringBuilder();
		String s2=sb.append(s1).reverse().toString();
		int flag=s2.compareTo(s1);
		if(flag==0)
			System.out.println(s1+" is a palindrome.");
		else
			System.out.println(s1+" is not an palindrome.");
	}
	public static void palindrome2(String s1) {
		//using string buffer.
		StringBuffer sb=new StringBuffer();
		String s2=sb.append(s1).reverse().toString();
		int flag=s2.compareTo(s1);
		if(flag==0)
			System.out.println(s1+" is a palindrome.");
		else
			System.out.println(s1+" is not an palindrome.");
	}
	public static void palindrome3(String s1) {
		//character compare using loop.
		int i;
		for(i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
				break;
		}
		if(i==s1.length())
			System.out.println(s1+" is a palindrome.");
		else
			System.out.println(s1+" is not an palindrome.");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		sc.close();
		System.out.println("using string builder");
		palindrome(s1);
		palindrome(s2);
		System.out.println("\n\n\nusing string buffer");
		palindrome2(s1);
		palindrome2(s2);
		System.out.println("\n\ncharacter compare using loop.");
		palindrome3(s1);
		palindrome3(s2);
	}

}
