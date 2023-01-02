public class O47Pattern {
	public static void main(String[] args) {
		int row=9;
		for(int i=1;i<=row;i++) {
			int num=1;
			for(int j=i;j<=row;j++)
				System.out.print("  ");
			for(int j=1;j<i;j++)
				System.out.print(num++ +" ");
			for(int j=1;j<=i;j++)
				System.out.print(num-- +" ");
			System.out.println();
		}
	}
}
