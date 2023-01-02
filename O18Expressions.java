public class O18Expressions {
	public static void main(String args[]) {
		int a=5,b=5,x=0;
		System.out.println("a="+a+"b="+b);
		System.out.println(++a-b--);
		System.out.println("a="+a+"b="+b);
		System.out.println(a%b++);
		System.out.println("a="+a+"b="+b);
		System.out.println(a=a*(b+5));
		System.out.println("a="+a+"b="+b);
		System.out.println(x);
		System.out.println(x=69>>>2);
	}
}
