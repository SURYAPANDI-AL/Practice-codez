import java.util.Scanner;
public class O02PrintUntilZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char alphabet=sc.next().charAt(0);
		if(alphabet>=65)
			for(char letter=alphabet;letter<='Z';letter++) 
				System.out.print(letter);
		sc.close();
	}
}
