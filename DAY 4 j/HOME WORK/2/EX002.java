import java.util.Scanner;
class EX002{
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);

	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	int number1[] =new int[size];
	
	for(int i=0; i<size; i++)
	{System.out.print("Enter the element " +(i+1)+":");
	number1[i]=sc.nextInt();}
	
	System.out.println();
	System.out.println(" element of the array:");
	for(int number:number1){
		System.out.print(number +"\t");
	}
}}