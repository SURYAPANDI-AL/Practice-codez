interface Statickeyword {				//static method inside interface
	public static void method2() {
		System.out.println("static method In iterface");
	}

}

public class O08StaticKeyword  {
	static int a=500;				//static variable
	static void method(int a) {		//static method
		System.out.println("in static method/method can be called without object");
	}

	public static void main(String[] args) {		//main method
		System.out.println("main block executes afterstatic block ");
		System.out.println("In main block.");
		System.out.println("Static variable access without object:");
		System.out.println(a);
		method(a);		//method call
		Statickeyword.method2();
		StaticClass.main(null);
		}
	static class StaticClass{		//static inner class
		public static void main(String args[]) {
			System.out.println("Innner static class");
		}
	}
	static {				//static block
		System.out.println("In static block");
	}

}
