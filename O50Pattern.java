public class O50Pattern {
	public static void main(String[] args) {
		int n=9;
		for(int i=1,count=n;i<=n;i++,count--) {
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print(count+" ");
			System.out.println();
		}
	} 
}
