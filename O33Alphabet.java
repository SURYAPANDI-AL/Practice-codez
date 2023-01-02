import java.util.Scanner;
public class O33Alphabet {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		if(letter>=65&&letter<=90||letter>=97&&letter<=122)
			System.out.println(letter+" is an alphabet.");
		else
			System.out.println(letter+" is not an alphabet.");
		sc.close();
	}
}
