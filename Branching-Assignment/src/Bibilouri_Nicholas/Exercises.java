/*
 * @author Nicholas Bibilouri
 */

package Bibilouri_Nicholas;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 0; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		return sum;
	}
	
	public static int evenFibSum ()
	{
		int num1 = 1, num2 = 1, sum = 0;
		while (num1 < 4000000)
		{
			if (num1 % 2 == 0)
				sum += num1;
			
			int temp = num2; 
			num2 += num1; 
			num1 = temp;
		}
		return sum;
	}
	
	public static int largestPrimeFactor ()
	{
		long value = 600851475143L;
		
		while (value % 2 == 0)
		{
			value %= 2;
		}
		
		for (long factor = 3; factor < value; factor = factor + 2)
		{
			while (value % factor == 0 && factor < value)
				value /= factor;
		}
		
		return (int) value;
	}
	
}
