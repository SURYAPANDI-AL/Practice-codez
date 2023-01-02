import java.util.Scanner;
public class O10AlternateSorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++)
			for(int j=i;j<n;j++)
				if(array[i]>array[j])
					array[i]=array[i]+array[j]-(array[j]=array[i]);
		int count=0,i=0,j=array.length-1;
		System.out.print("{");
		while(count<array.length) {
			if(count%2==0) {
				System.out.print(array[j]);
				j--;}
			else {
				System.out.print(array[i]);
				i++;}
			if(count!=array.length-1)
				System.out.print(",");
			count++;
		}System.out.print("}");
	}
}
