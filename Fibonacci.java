public class Fibonacci 
{
	
	public static void main(String args []) 
	{
		
		int total = 8;
		int a = 0;
		int b = 1;
		
		
		for(int i =1; i<=total; i++) 
		{
			
			System.out.print(a + " ");
			int sum = a+ b;
			a= b;
			b=sum;
		}
		
		
	}
}