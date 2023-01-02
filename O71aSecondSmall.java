import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class O71aSecondSmall {

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
		int s=(b[0]>b[1])?b[0]:b[1];
		int ss=(b[0]<b[1])?b[0]:b[1];
		for(int i:b){
            if(i<s) {
                ss=s;
                s=i;
            }
            if(i>s&&i<ss)
                ss=i;
        }
		System.out.println("\n\n\nloop traversing.");
		System.out.println("second smallest number: "+ss);
		sc.close();
		
		
		//sort array
				System.out.println("\n\n\nSorting the array.");
				
				Arrays.sort(b);
				System.out.println("second smallest number: "+b[1]);
	}

}
