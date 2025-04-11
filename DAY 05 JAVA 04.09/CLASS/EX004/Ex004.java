import java.util.Scanner;
class Ex004{
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

    String days[]={"MONDAY","TUESDAY","WEDNESDAY ","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
	for (String day:days){
		System.out.println(day);
	}

	}}