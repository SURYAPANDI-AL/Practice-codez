import java.util.Arrays;
import java.util.Scanner;
public class O62aEvenAndPrint {
	public static void main(String[] args) {
		System.out.println("enter the num of elements:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]= new int[no];
		for(int i=0;i<no;i++)
			arr[i]=sc.nextInt();
		sc.close();
		int n=(arr.length%2==0)?arr.length:arr.length-1;
		System.out.println("Odd position	| Even position");
		for(int i=0;i<n;i+=2) 
			System.out.println(arr[i]+"	 	| 	"+arr[i+1]);
		if(n!=arr.length)
			System.out.println(arr[n]+"	 	| ");
		System.out.println("\n\n\n");
		
		//method 2
		
		int odd[]=new int[arr.length/2+(arr.length%2)],even[]=new int[arr.length/2];
		int c1=0,c2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0) {
				odd[c1]=arr[i];
				c1++;
			}
			else {
				even[c2]=arr[i];
				c2++;
			}
		}
		System.out.println("ODD:  "+Arrays.toString(odd));
		System.out.println("EVEN: "+Arrays.toString(even));

	}

}
