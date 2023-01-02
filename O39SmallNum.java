import java.util.Scanner;
public class O39SmallNum {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int s_num=arr[0];
		for(int i=0;i<num;i++) {
			if(s_num>arr[i])
				s_num=arr[i];	
		}
		System.out.print("Smallest Elements in Array: "+s_num);
		sc.close();
	}
}
