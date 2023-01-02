import java.util.Arrays;
import java.util.Scanner;

public class O91aDescendingWordCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char a[]=str.toCharArray();
		Arrays.sort(a);
		sc.close();
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
	}

}
