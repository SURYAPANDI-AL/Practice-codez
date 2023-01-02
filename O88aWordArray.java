import java.util.Scanner;
import java.util.regex.Pattern;

public class O88aWordArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strarray= {};
		Pattern pt=Pattern.compile(" ");
		strarray=pt.split(str);
		for(int i=0;i<strarray.length;i++)
			System.out.println(strarray[i]);
		sc.close();
	}

}
