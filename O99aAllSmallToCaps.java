import java.util.Scanner;

public class O99aAllSmallToCaps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
			System.out.print((char) (str.charAt(i)>=97?str.charAt(i)-32:str.charAt(i)));
		sc.close();	
	}

}
