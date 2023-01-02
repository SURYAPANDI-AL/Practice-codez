import java.util.Scanner;
public class O42Frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of elements:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		int fr[]=new int[arr.length];
		int visit=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit)
				fr[i]=count;
		}
		System.out.println("Element-Frequency");
		for(int i=0;i<arr.length;i++) {
			if(fr[i]!=visit)
				System.out.println(arr[i]+"      - "+fr[i]);
		}
	}
}
