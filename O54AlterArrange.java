import java.util.Scanner;
public class O54AlterArrange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
			arr[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<a-1;i++) {
			for(int j=i+1;j<a;j++) {
				if(i%2==0) {
					if(arr[i]>arr[j])
						arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
				}
				else {
					if(arr[i]<arr[j])
						arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
				}
			}
		}
		for(int k:arr)
			System.err.print(k+" ");
	}
}
