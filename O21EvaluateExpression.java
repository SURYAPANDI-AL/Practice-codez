public class O21EvaluateExpression {
	public static void main(String[] args) {
		int y=10;
		int z = (++y * (y++ + 5));
		System.out.println(z);
	}
}
