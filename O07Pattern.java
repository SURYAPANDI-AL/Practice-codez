import java.util.*;
public class O07Pattern {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String word = in.next();
		for(int i=0;i< word.length();i++){
			for(int j=0;j<word.length();j++){
				if(i==j||i+j==word.length()-1)
					System.out.print(word.charAt(i)+" ");
				else
					System.out.print("  ");
			}System.out.println();
		}in.close();
	}
}

