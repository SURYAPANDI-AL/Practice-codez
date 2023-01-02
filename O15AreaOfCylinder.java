import java.util.Scanner;
public class O15AreaOfCylinder {
	public static void main(String[] args) {
		final double PI=3.142857d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of the Cylinder:");
		double height=sc.nextDouble();
		System.out.println("Enter radius of the Cylinder:");
		double radius=sc.nextDouble();
		double area=2*PI*radius*(radius+height);
		System.out.println("Area Of Cylinder:"+String.format("%.2f", area));
		sc.close();
	}
}
