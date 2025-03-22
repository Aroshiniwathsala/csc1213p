import java.util.Scanner;

class Ex004
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
	
	System.out.println("Full name:"+fname+"  "+Iname+"\n"+"Marks is "+marks);
}
	
	
}