/**@author Kristina Jokic*/

package jokic_kristina;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for(int i=0; i<1000; i++)
		{
			if(i%5 == 0 || i%3 == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		
		int i = 1;
		int beforeI = 0;
		while(i<4000000)
		{
			if(i%2 == 0)
				sum = sum +i;
			
			int temp = i;
			i = i + beforeI;
			beforeI = temp;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long value = 600851475143L;
		
		while(value % 2 == 0)
		{
			value = value %2;
		}
		
		for(long factor = 3; factor < value; factor = factor+2)
		{
			while(value % factor == 0 && factor <value)
			{
				value = value / factor;
			}
		}
		return (int) value;
	}
	
}
