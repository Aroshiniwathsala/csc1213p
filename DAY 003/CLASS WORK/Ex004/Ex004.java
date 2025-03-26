import java.util.Scanner;
class Ex004
{
	public static void main(String args[])
	{
	 Scanner ob =new Scanner(System.in);
     System.out.println("Enter a charater");
     char bb=ob.next().charAt(0);

	 switch(bb){
			
		case 'a' :System.out.println("it is  a Vowel");	
		break;
			
		case 'e' :System.out.println("it is  a Vowel");	
		break;
				
			
		case 'i' :System.out.println("it is  a Vowel");	
		break;
				
		case 'o' :System.out.println("it is  a Vowel");	
		break;
				
		case 'u' :System.out.println("it is  a Vowel");	
		break;
				
	   default	:	System.out.println("Not a Vowel");	
		}
		

		
	}
}