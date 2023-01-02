import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class O90aWordsAsscending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strarray= {};
		Pattern pt=Pattern.compile(" ");
		strarray=pt.split(str);
		Arrays.sort(strarray);
		System.out.println(Arrays.toString(strarray));
		sc.close();
	}

}
