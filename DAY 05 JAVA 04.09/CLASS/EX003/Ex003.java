import java.util.Scanner;
class Ex003{
	public static void main(String args[])
	{
	int numbers []=new int[10];
	Scanner ob=new Scanner(System.in);
	
	// TAke inputs
	
	for (int i=0; i<10; i++)
	{
		System.out.println("enter a number");
		numbers[i]=ob.nextInt();
	}
	
	System.out.println();
	
	// Print inputs
	for (int i=0; i<10; i++)
	{
		System.out.println(numbers[i]);

	}
	System.out.println();	

	String Days[]=new String[7];
	Days[0]="Monday";
	Days[1]="Tuest day";
	Days[2]="Wednesday";
	Days[3]="Thurst Day";
	Days[4]="Friday";
	Days[5]="Saturday";
	Days[6]="Sunday";
	
	for (int i=0; i<7; i++)
	{
		System.out.println(Days[i]);
	}

	
	
	}
}