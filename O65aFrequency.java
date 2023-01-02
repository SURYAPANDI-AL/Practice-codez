import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class O65aFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int count=1;
		Arrays.sort(a);
		System.out.println("looping method-1");
		System.out.println("elements==>frequency");
		for(int i=0;i<a.length;i++) {
			if(i+1!=a.length) 
				if(a[i]==a[i+1]) 
					count++;
				else {
					System.out.println(a[i]+"	==>	"+count);
					count=1;
				}
			else {
				System.out.println(a[i]+"	==>	"+count);
				count=1;
			}
		}
		
		
		///Hash map
		System.out.println("hashmap method-2");
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i],1);
		}
		System.out.println("elements==>frequency");
		for(int i:map.keySet())
			 System.out.println(i + "  ==> " + map.get(i));
		
	}

}
