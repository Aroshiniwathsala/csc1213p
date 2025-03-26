import java.util.Scanner;
class Ex007{
public static void main(String args[])
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num1 =Sc.nextInt();
	
	
	System.out.println("Enter the number 2 ");
	int num2=Sc.nextInt();
	
	for(int i=1; i<=num1; i++){
		System.out.print("   Value for i=  "+i);
		
		for(int j=1; j<=num2; j++){
		System.out.print("    Value for j= "+j+" ");
		
		}
		System.out.println();
	}
}
}