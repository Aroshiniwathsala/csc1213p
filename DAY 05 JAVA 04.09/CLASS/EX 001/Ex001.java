import java.util.Scanner;
class Ex001{
public static void main(String args[]){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter a number");
	int n1=ob.nextInt();
	
	System.out.println("Enter a number");
	int n2=ob.nextInt();
	System.out.println("Enter a number");
	int n3=ob.nextInt();
	System.out.println("Enter a number");
	int n4=ob.nextInt();
	System.out.println("Enter a number");
	int n5=ob.nextInt();
	
	
	int  Numbers[] =new int [5];
	Numbers[0]=n1;
	Numbers[1]=n2;
	Numbers[2]=n3;
	Numbers[3]=n4;
	Numbers[4]=n5;
	
	System.out.println();
	
	System.out.println(Numbers[0]);
	System.out.println(Numbers[1]);
	System.out.println(Numbers[2]);
	System.out.println(Numbers[3]);
	System.out.println(Numbers[4]);
	
	System.out.println();
	
	int sum=n1+n2+n3+n4+n5;
	System.out.println("Sumation is"+sum);
}}