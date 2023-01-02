import java.util.Scanner;
public class O29VowelOrConstant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		System.out.println((letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'||letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')?"VOWEL":"CONSONANT");
		sc.close();
	}
}
