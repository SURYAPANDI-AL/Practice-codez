import java.util.Scanner;
public class O43LeftRotate {
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
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
		sc.close();
	}
}
