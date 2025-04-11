import java.util.Scanner;
class Ex002{
public static void main(String args[]){
	Scanner ob=new Scanner(System.in);
	int  Numbers[] =new int [5];
	int sum=0;
	
	for (int i=0; i<5; i++){
	System.out.println("Enter a number");
	Numbers[i]=ob.nextInt();
	
	sum=sum+Numbers[i];

	}
	System.out.println("Sumation is"+sum);
}}