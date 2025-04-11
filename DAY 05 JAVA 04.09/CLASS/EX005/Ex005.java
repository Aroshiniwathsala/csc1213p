import java.util.Scanner;
class Ex005{
	public static void main(String args[]){
		
		int Numbers[] =new int [5]; //create array
		Scanner ob=new Scanner(System.in); //input 
		//take inputs
		for(int i=0; i<5; i++){
			System.out.println("Enter a number");
			Numbers[i]=ob.nextInt();	
		}
		 // great
		int min=Numbers[0];
		int max=Numbers[0];
		for(int i=0; i<5; i++){
			if(Numbers[i]< min)
			{
				min=Numbers[i];
			}
			if(Numbers[i]>max){
				max=Numbers[i];
			}
		}
		
		System.out.println("maximum ="+max);
		System.out.println("Minimum ="+min);
	}
	
	
}