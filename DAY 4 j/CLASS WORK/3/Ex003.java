import java.util.Scanner;
class Ex003{
	public static void main(String args[])
{     int i,j;
     int count1=0;
	 int count2=0;
	Scanner ob=new Scanner(System.in);
	char p=' ';
	do{
		System.out.println("Enter a number");
		int n=ob.nextInt();
		
		System.out.println("DO you want to continue (y/n)");
	    p=ob.next().charAt(0);
		
		if(n%2==0)
		{
			count1=count1+1;
			
		}
		else {
	    count2=count2+1;
		
		}
	}while(p=='y');
	System.out.println("EVEN NUMBERS :"+count1);
	
	System.out.println("ODD NUMBERS :"+count2);
	
	
	
}}