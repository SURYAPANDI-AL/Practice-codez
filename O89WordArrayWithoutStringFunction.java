import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class O89WordArrayWithoutStringFunction{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashSet<String> str_set=new HashSet<String>(Arrays.asList(s));
		String strarray[]=new String[str_set.size()];
		int i= 0;
		for (String str : str_set) {
			strarray[i++] = str;
		}
		System.out.println(Arrays.toString(strarray));
		sc.close();
	}
}