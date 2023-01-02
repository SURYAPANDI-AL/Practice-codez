import java.util.Scanner;
public class O17AreaBetweenCircles {
	public static void main(String[] args) {
		final double PI=3.142857;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inner circle radius:");
		double innerCircleRadius=sc.nextDouble();
		System.out.println("Outer circle radius:");
		double outerCircleRadius=sc.nextDouble();
		double areaBetweenCircles;
		areaBetweenCircles=PI*(Math.pow(outerCircleRadius, 2)-Math.pow(innerCircleRadius, 2));
		System.out.println("Area between circles:"+String.format("%.2f",areaBetweenCircles));
		sc.close();		
	}
}
