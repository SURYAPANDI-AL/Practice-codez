import java.util.Scanner;
public class O60SeriesSum {
	public static int sum(int i,int num) {
		if(i==num+1)
			return 0;
		int element=0,digit=i;
		while(digit!=0) {
			digit=digit-1;
			element=element*10+1;
		}
		System.out.print(element);
		if(i!=num)
			System.out.print(" + ");
		return element+sum(i+1,num);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the number of terms : ");
		int n=sc.nextInt();
		System.out.println("\nThe Sum is : "+(sum(1,n)));
		sc.close();
	}
}
