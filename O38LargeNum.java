import java.util.Scanner;
public class O38LargeNum {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int l_num=arr[0];
		for(int i=0;i<num;i++) {
			if(l_num<arr[i])
				l_num=arr[i];	
		}
		System.out.print("Largest Elements in Array: "+l_num);
		sc.close();
	}
}
