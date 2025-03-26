import java.util.Scanner;
class Ex001{
 public static void main(String args[])
 {
	Scanner ob =new Scanner(System.in);
	System.out.println("Entert a number :");
	int num=ob.nextInt();
	if (num >0)
	{
		System.out.println(num +"possitive number");
		
		
	}
	 else if (num <0){
		 
		 System.out.println(num +"negative number");
	 }
	 
	 else{
		 System.out.println(num +"It is zero");
	 }
 } 
	
}