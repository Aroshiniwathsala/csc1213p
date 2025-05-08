public class Ex005{
	static int findmax(int a, int b,int c){
		if (a>b && a>=c){
		return a;
		}else if (b>a && b>=c){
			return b;
		}else {
			return c;
			
		}
	}
	public static void main (String args []){
	int max=findmax(10 ,25,60);
	
	System.out.println("maximum is : "+max);
	}
}