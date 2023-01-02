import java.util.Scanner;
public class O13AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the side:");
		double side=sc.nextDouble();
		double area=Math.pow(side, 2);
		System.out.println("Area Of Square:"+String.format("%.2f", area));
		sc.close();
	}
}
