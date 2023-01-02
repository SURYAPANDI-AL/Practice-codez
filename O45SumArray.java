import java.util.Scanner;
public class O45SumArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int count=sc.nextInt();
		int arr[]=new int[count];
		int sum=0;
		for(int i=0;i<count;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of all the items of the array: "+sum);
		sc.close();
	}
}
