public class Employe
{
	
	public static void main(String args []) 
{
		
		int expirience = 6;
		double salary = 20000.0;
		double bonus = 0;
		if(expirience <=4) 
		{
			bonus = salary *4/100; 
		}		
		else if ( expirience >=5 && expirience <=9)
		{
			bonus = salary *10/100;
		}
		else
		{
			bonus = salary *15/100;
		}
 System.out.println(expirience + " " + "YEARS OF EXPIRIENCE = " + bonus + " BONUS PLUS SALARY " +   salary);
}
}