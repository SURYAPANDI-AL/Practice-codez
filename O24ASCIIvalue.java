import java.util.Scanner;
public class O24ASCIIvalue {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the alphabet:");
		char letter=sc.next().charAt(0);
		int ASCIIvalue=letter;
		System.out.println("AsCII value of "+letter+" = "+ASCIIvalue);
		sc.close();
	}
}
