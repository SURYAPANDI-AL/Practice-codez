import java.util.Scanner;
public class O46RightRotate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("enter the elements:");
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter the number of shifts:");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		sc.close();
	}
}
