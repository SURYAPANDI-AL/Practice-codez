import java.util.Scanner;
public class O01MultiSubTable {
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("MULTIPLICATION & SUBRACTION TABLE - "+ num);
		for(int i=1;i<=20;i++) {
			System.out.println(num+" * "+i+" = "+(i*num)+"		"+num+" - "+i+" = "+(num-i));
		}
		sc.close();
	}
}
