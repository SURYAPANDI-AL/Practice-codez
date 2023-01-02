import java.util.Scanner;
public class O05AlphabetPattern {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		char alphabet=sc.next().charAt(0);
		if(alphabet>=65&&alphabet<=90)
			for(char letter=alphabet;letter>='A';letter--){
				for(char column='A';column<=letter;column++) {
					System.out.print(letter+" ");
				}System.out.println();
		}sc.close();
	}
}
