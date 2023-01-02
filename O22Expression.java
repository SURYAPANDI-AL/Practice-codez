import java.util.Scanner;

public class O22Expression {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("Enter how many operations to done:");
		int num=sc.nextInt();
		System.out.println("choose the expression:");
		System.out.println("1-pre increment\n2-post increment\n3-pre decrement\n4-post decrement\n5-print number");
		while(num!=0)
		{
			System.out.print("Choice:");
			int i=sc.nextInt();
			switch(i){
			case 1:
				System.out.println(++n);
				break;
			case 2:
				System.out.println(n++);
				break;
			case 3:
				System.out.println(--n);
				break;
			case 4:
				System.out.println(n--);
				break;
			case 5:
				System.out.println(n);
				break;
			}
			num--;
		}
		sc.close();
	}

}
