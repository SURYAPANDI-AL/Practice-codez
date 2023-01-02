import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class O94aAnagram {
	public static void loop(String s1,String s2) {
		System.out.println("\n\n\nCounting equal characters.");
		char A[]=s1.toCharArray();
		//Arrays.sort(A);
		char B[]=s2.toCharArray();
		//Arrays.sort(B);
		int count=0;
		for(int i=0;i<A.length;i++) 
			for(int i1=0;i1<A.length;i1++) {
				if(A[i]==B[i1]) {
					B[i1]=' ';
					count++;
					break;
				}
			}
		System.out.println(count==s1.length()?"it's an anagram":"it is not an anagram");
		
	}

	public static void main(String[] args) {
		//Method-1
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		loop(s1,s2);
		s1=Arrays.stream(s1.split("")).sorted().collect(Collectors.joining(""));
		//System.out.println(s1);
		s2=Arrays.stream(s2.split("")).sorted().collect(Collectors.joining(""));
		//System.out.println(s2);
		int c=s1.compareTo(s2);
		System.out.println("\n\n\nusing compare to function.");
		System.out.println(c==0?"it's an anagram":"it is not an anagram");
		sc.close();
	}

}

