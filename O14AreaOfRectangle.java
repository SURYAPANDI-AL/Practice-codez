import java.util.Scanner;
public class O14AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle:");
		double length=sc.nextDouble();
		System.out.println("Enter breadth of the Rectangle:");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("Area Of Rectangle:"+String.format("%.2f", area));
		sc.close();
	}
}
