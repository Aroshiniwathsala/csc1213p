import java.util.Scanner;
class Ex002{
	public static void main(String args[])
{
     int sum=0;
	Scanner ob=new Scanner(System.in);
	char p=' ';
	do{
		System.out.println("Enter a number");
		int n=ob.nextInt();
		
		System.out.println("DO you want to continue (y/n)");
	    p=ob.next().charAt(0);
		
		sum=sum +n;
		
	}while(p=='y');
	System.out.println(sum);
	
	
	
	
	
}}