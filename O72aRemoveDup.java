import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class O72aRemoveDup {

	public static void main(String[] args) {
		//using hash set.
		
		HashSet<Integer> set=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			set.add(a[i]);
		int b[]=new int[set.size()],x=0;
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			b[x]=i.next();
			x++;
		}
		System.out.println("\n\n\nhash set method.");
		System.out.println(Arrays.toString(b));
		sc.close();
		
		//sorting
		System.out.println("\n\n\nsorting method.");
		Arrays.sort(a);
		int num=a[0];
		System.out.print(num+" ");
		for(int i1=0;i1<n;i1++) {
			if(num!=a[i1])
			{
				System.out.print(a[i1]+" ");
				num=a[i1];
			}
		}
	}

}
