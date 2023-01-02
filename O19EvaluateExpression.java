public class O19EvaluateExpression {
	public static void main(String[] args) {
		int a=28;
		a+=a++ + ++a + --a + a--;
		System.out.println(a);
	}
}
