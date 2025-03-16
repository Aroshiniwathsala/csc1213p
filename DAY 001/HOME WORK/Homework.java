class Homework
{
	public static void  main(String[] args)
	{
		int x=30, y=6;
		System.out.println("Decrementing :"+(x--));
		System.out.println("After Decrementing :"+(--x));
		System.out.println("Incrementing  :"+(y++));
		System.out.println("After Incrementing:"+(++y));
		System.out.println();
		
		System.out.println("x&&y: "+((x==y)&&(x!=y)));
		System.out.println("x||y: "+((x!=y)||(x>y)));
		System.out.println("!(xy): "+((x>y)));
		System.out.println();
		
		
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y :"+(x!=y));
		System.out.println("x>y :"+(x>y));
		System.out.println("x<y :"+(x<y));
		System.out.println();
		
		
		int z=36;
		System.out.println("z=x+y :"+(z=x+y));
		System.out.println("z-=x"+(z-=x));
		System.out.println("z+=x"+(z+=x));
		System.out.println("z*=x"+(z*=x));
		System.out.println("z/=x"+(z/=x));
		System.out.println("z%=x"+(z%=x));
		System.out.println();
		
		String result;
		result=(x<24)?"You are selected ":"You are not selected";
		System.out.println(result);
		
	}
	
	
}