package Chinni_Rohan;
/**
 * 
 * @author Rohan Chinni
 *
 */
public class Exercises 
{
	public static void main (String[] agrs)
	{
		System.out.println(threeAndFive());
		System.out.println(evenFibSum());
		System.out.println(largestPrimeFactor());
	}
	
	public static int threeAndFive()
	{
		int num = 0;
		for (int i = 0; i<1000; i++)
		{
			if (i%3==0 || i%5==0)
				num+=i;
		}
		return num;
	}
	public static  int evenFibSum()
	{
		int sum = 0;
		int[] num = {1,1};
		while (num[0]+num[1]<4000000)
		{
			if ((num[0]+num[1])%2 == 0)
			{
				sum+=(num[0]+num[1]);
			}
			int temp = num[0];
			num[0] = num[1];
			num[1] = temp+num[1];
		}
		return sum;
	}
	public static int largestPrimeFactor()
	{
		int i; 
		long input = 600851475143l; 
		for (i = 2; i < input; i++) 
		{ 
			if (input % i == 0) 
			{
				input /= i; 
				i--; 
			} 
		} 
		return i; 
	}

		
	
}
