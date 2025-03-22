import java.util.Scanner;

class Ex005
{
	public static void main(String args[])
	{
	String fname;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter your frist name :");
	fname = sc.nextLine();
	
	System.out.print("Enter your Last name :");
    String Iname =sc.next();
	
	System.out.print("Enter your marks :");
	int marks=sc.nextInt();
	
	System.out.println("Enter sex (M/F) :");
	char sex=sc.next().charAt(0);
	
	
	System.out.println("Enter your GPA :");
	double GPA=sc.nextDouble();
	
	
    System.out.println("Enter Mobile number :");
	long Mobile=sc.nextLong();
	
	System.out.println("Full name:"+fname+"  "+Iname+"\n"+"Marks is "+marks+"your sex :"+sex+"\n"+"your mobile no:"+Mobile+"\n"+"GPA :"+GPA);
	
	
}
	
	
}