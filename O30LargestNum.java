import java.util.Scanner;
public class O30LargestNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("largest number:"+a);
		else if(b>a&&b>c)
			System.out.println("largest number:"+b);
		else
			System.out.println("largest number:"+c);
		sc.close();
	}
}
