public class O48Pattern {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("  ");
			}
			for(int j=0,count=n-i;j<i+1;j++) {
				System.out.print(count++ +" ");
			}
			for(int j=0,count=n;j<i;j++) {
				System.out.print(--count+" ");
			}
			System.out.println();
		}
	}
}
