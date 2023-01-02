import java.util.Scanner;
public class O53NtimeAlpha {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input=sc.next();
        sc.close();
        int num=0,count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=48&&input.charAt(i)<=57){
                num=input.charAt(i)-48;
                if(i!=input.length()-1){
                    if(input.charAt(i+1)>=48&&input.charAt(i+1)<=57){
                    		num=num*10+(input.charAt(i+1)-48);
                    		count=1;
                    		i++;
                        }
                }
            
              for(int i1=0;i1<num;i1++){
            	  if(count==0)
            		  System.out.print(input.charAt(i-1));
            	  else
            		  System.out.print(input.charAt(i-2));
              }
              count=0;
            }           
        }
    }
}
