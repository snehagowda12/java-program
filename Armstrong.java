class ArmstrongCalc
{
	public static void main(String[] ar)
	{
	//Initialisation
		for(int Armstrong=0;Armstrong<100000;Armstrong++)
		{
		int no=Armstrong;
		int no2=Armstrong;
		int count=0;
		int sum=0;
	
	//Calculation of DigitCount
		while(no2>0)
		{
			count++;
			no2=no2/10;
		}
	//Calculating the ARMSTRONG no
		while(no>0)
		{
			int split=no%10;
			sum+=powercalc(count,split);
			no=no/10;
		}

         //Check whether this no is ARMSTRONG or NOT
		if(sum==Armstrong)	
		{
 			System.out.println(Armstrong);
		}
		
	   }
	}
	public static int powercalc(int count,int split)
	{
		int pow=1;
		for(int i=0;i<count;i++) //times
		{
				pow*=split;
		}
		return pow;
	
	}
}