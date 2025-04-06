import java.util.Scanner;
class EX01{
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);

	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	
	int number1[] =new int[size];
	
	//Taking input from user
	
	for(int i = 0; i < number1.length; i++);
	{System.out.print("Enter the element " + (i + 1)+" :");
	number1[i]=sc.nextInt();}
	
	//printing array element
	
	System.out.println("\n Array Elements");
	for(int i=0; i<number1.length; i++){
		System.out.println(number1[i]+"\t");
	}
	
	//Logical for max, min,sum,avg
	
	int max =number1[0];
	int min =number1[0];
	int sum =0;
	double average;
	
	for(int i=0; i< number1.length; i++){
		if (number1[i]>max){
			max = number1[i];
			
		}
		if (number1[i]<min){
			min = number1[i];
			
		}
		sum+= number1[i];
		
	}
	average = (double)sum / number1.length;
	
	//display results
	System.out.println("\n \n Maximum  Element"+max);
	System.out.println("\n minimum  Element"+min);
	System.out.println("\n summation "+sum);
	System.out.println("\n Avarage "+average);
	
	//Serch a element in the array 
	System.out.println("\n Enter the  Element element you want to search");
	int s=sc.nextInt();
	boolean found =false;
	
	for (int i=0; i<number1.length; i++){
	{if (number1[i]==s)
		System.out.println("\n elememt found position ");
	found =true ;
	break;
	}
	}
	if (!found ){
		System.out.println("Element is not found");
		
	}
	
	boolean isUnique =true;
	for (int i=0; i<number1.length ; i++)
	{
		for (int j=i+1; j<number1.length ; j++){
			if(number1[i]==number1[j]){
				isUnique=false;
				break;
				
			}
			if(!isUnique){
				break;
				
			}
		}if(!isUnique){
			System.out.println("all element are unique");
	}else{System.out.println("NOT UNIQUE");}
}}}