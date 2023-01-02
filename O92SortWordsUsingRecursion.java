import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class O92SortWordsUsingRecursion {
	
	public static void sort(String[]str,int n) {
		if(n==1)
			return;
		for (int i=0; i<n-1; i++)
			if (str[i].compareTo( str[i+1])>0) {
				 String temp = str[i];
	                str[i] = str[i+1];
	                str[i+1] = temp;
			}
		sort(str, n-1);
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strarray= {};
		Pattern pt=Pattern.compile(" ");
		strarray=pt.split(str);
		sort(strarray, strarray.length);
		System.out.println(Arrays.toString(strarray));
		sc.close();
	}

}