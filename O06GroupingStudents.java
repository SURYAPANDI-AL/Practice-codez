import java.util.Scanner;
public class O06GroupingStudents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Total Number of students : ");
		int students=sc.nextInt(),startingRollNumber=101,groups=4,lastRollNo;
		lastRollNo=students+startingRollNumber-1;
		for(int groupNumber=1;groupNumber<=groups;groupNumber++) {
			System.out.println("Group:"+groupNumber);
				for(int rollNo=(startingRollNumber+groupNumber-1);rollNo<=lastRollNo;rollNo+=4) {
						System.out.println(rollNo);
					}
		}sc.close();
	}
}
