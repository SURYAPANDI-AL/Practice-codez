import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class O70aSecondLarge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		//loop traversing.
		HashSet <Integer> set=new HashSet<>();
		for(int i:a)
			set.add(i);
		int b[]=new int[set.size()];
		int x=0;
		for(int k:set) {
			b[x++]=k;
		}
		int l=(b[0]>b[1])?b[0]:b[1];
		int sl=(b[0]<b[1])?b[0]:b[1];
		for(int i:a){
            if(i>l) {
                sl=l;
                l=i;
            }
            if(i<l&&i>sl)
                sl=i;
        }
		System.out.println("\n\n\nloop traversing.");
		System.out.println("second largest number: "+sl);
		sc.close();
		
		//sort array
		System.out.println("\n\n\nSorting the array.");
		
		Arrays.sort(b);
		System.out.println("second largest number: "+b[b.length-2]);
	}

}
