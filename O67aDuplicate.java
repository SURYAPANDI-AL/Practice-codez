import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class O67aDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		HashSet <Integer> set= new HashSet<Integer>();
		System.out.print("Repeated element:");
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					set.add(a[i]);
					break;
				}
			}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
