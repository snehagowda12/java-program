class HelloWorld
{
	public static void main(String[] arg)
	{
	for(int i=1;i<=30;i++)
	 {
		if(i%5==0 && i%3==0)
		{
			System.out.println("Hello World");
		}

		else if(i%3==0)
		{
			System.out.println("Hello");
		}

		else if(i%5==0)
		{
			System.out.println("World");
		}

		else
		{
			System.out.println(i);
		}
	}
  }
}