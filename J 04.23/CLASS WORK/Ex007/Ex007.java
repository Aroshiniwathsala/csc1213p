class Ex007{
   public static void main(String args[]){
   int marks [][]=new int[2][2];	
	Scanner ob= new Scanner(System.in);
	
	
	
	for(int i=0; i<2; i++)
		
		{
			for(int j=0; j<2; j++){
				
				System.out.println("Enter marks :");
				int marks[i][j]=ob.nextInt();
				System.out.print(marks [i][j]+" ");
				
			}
			System.out.println();
		}
		
	
	
	
	
}}