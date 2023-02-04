class Denomination
{
	public static void main(String[] args)
	{
 int originalAmt=45624;
 int dupAmt=originalAmt;
 int sum=0;
 int notes;
	while(dupAmt>= 2000)	
	{
		notes=	dupAmt/2000;
		System.out.println("2000*"+notes+"="+notes*2000);
		sum+=	notes*2000;
		dupAmt%=2000;
	}	
	while(dupAmt>= 500)	
	{
		notes=	dupAmt/500;
		sum+=	notes*500;
		dupAmt%=500;
	}
	while(dupAmt>= 200)	
	{
		notes=	dupAmt/200;
		sum+=	notes*200;
		dupAmt%=200;
	}
	while(dupAmt>= 100)	
	{
		notes=	dupAmt/100;
		sum+=	notes*100;
		dupAmt%=100;
	}
	while(dupAmt>= 50)	
	{
		notes=	dupAmt/50;
		sum+=	notes*50;
		dupAmt%=50;
	}
	while(dupAmt>= 20)	
	{
		notes=	dupAmt/20;
		sum+=	notes*20;
		dupAmt%=20;
	}
	while(dupAmt>= 10)	
	{
		notes=	dupAmt/10;
		sum+=	notes*10;
		dupAmt%=10;
	}
	while(dupAmt>= 5)	
	{
		notes=	dupAmt/5;
		sum+=	notes*5;
		dupAmt%=5;
	}
	while(dupAmt>= 2)	
	{
		notes=	dupAmt/2;
		sum+=	notes*2;
		dupAmt%=2;
	}
	while(dupAmt>= 1)	
	{
		notes=	dupAmt/1;
		sum+=	notes*1;
         }
}
}
