import java.util.Scanner;
public class O59Substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("String 1:");
		String str1=sc.next();
		System.out.print("String 2:");
		String str2=sc.next();
		int s1len=str1.length(),s2len=str2.length(),i,j,flag=0;
		for(i=0;i<s1len-s2len+1;i++) {
			for(j=0;j<s2len;j++) {
				if(str1.charAt(i)!=str2.charAt(j)) 
					break;
				if(j==s2len-1) {
					System.out.println(i-j);
					flag=1;
				}
				i++;
			}
		}
		if(flag==0)
			System.out.println(-1);
		sc.close();
	}
}
