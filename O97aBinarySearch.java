public class O97aBinarySearch {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		System.out.println(s);
		char c='s';
		System.out.println("find:"+c);
		int l=0,h=s.length();
		while(l!=h) {
			int m=(l+h)/2;
			if(c==s.charAt(m)) {
				System.out.println("Index At: "+m);
				break;
			}
			else if(c<s.charAt(m))
				h=m;
			else if(c>s.charAt(m))
				l=m;
			
		}
	}

}
