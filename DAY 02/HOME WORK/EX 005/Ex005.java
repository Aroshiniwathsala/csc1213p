import java.util.Scanner;


class Ex005
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		 
		 System.out.println("Input the value");
		 boolean val01 = ob.nextBoolean();
		 System.out.println("Output :"+val01);
		 
		 
		 System.out.println("Input the value :");
		 byte val02 = ob.nextByte();
		 System.out.println("Output :"+val02);
		 
		System.out.println("Input the value :");
		short val03 = ob.nextShort();
		System.out.println("Output:"+val03);
		
		System.out.println("Input the value :");
		int val04 = ob.nextInt();
		System.out.println("Output:"+val04);
		
		System.out.println("Input the value :");
		float val05 = ob.nextFloat();
		System.out.println("Output:"+val05);
		
		System.out.println("Input the value :");
	    double val06=ob.nextDouble();
		System.out.println("Output:"+val06);
		
		System.out.println("Input the value :");
		long val07=ob.nextLong();
		System.out.println("Output:"+val07);
		
		
		
	}
}