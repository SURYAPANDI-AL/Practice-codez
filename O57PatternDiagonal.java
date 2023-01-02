import java.util.Scanner;
public class O57PatternDiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		int length=in.length();
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(i==j)
					System.out.print(in.charAt(i));
				else if(i+j==length-1)
					System.out.print(in.charAt(j));
				else
					System.out.print(" ");
			}System.out.println();
		}sc.close();
	}
}
