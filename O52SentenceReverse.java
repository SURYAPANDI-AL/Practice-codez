import java.util.Scanner;
public class O52SentenceReverse {
	public static String reverse(String in) {
        int index=in.indexOf(' ');
        if(index==-1)
            return in;
        else
           return reverse(in.substring(index+1,in.length()))+" "+in.substring(0,index);         
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		System.out.println(reverse(in));
		sc.close(); 
	}
}
