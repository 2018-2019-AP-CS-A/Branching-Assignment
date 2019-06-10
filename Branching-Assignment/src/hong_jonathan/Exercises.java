package hong_jonathan;
/** @author Jonathan Hong **/
public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (i %5 == 0 || i %3 == 0)
				sum = sum + i;
		}
		return sum;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		int[]num = {1,1};
		while (num[0]+num[1]<4000000)
		{
			if((num[0]+num[1])%2 == 0)
			{
				sum+= (num[0]+num[1]);
			}
			int temp = num[0];
			num[0] = num[1];
			num[1] = temp + num[1];
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		int i;
		long num = 600851475143l;
		for (i = 2; i < num; i++)
		{
			if (num %i == 0)
			{
				num/=i;
				i--;
			}
		}
		return i;
	}
	
	public static void main(String[] args)
	{
		System.out.println(threeAndFive());
		System.out.println(evenFibSum());
		System.out.println(largestPrimeFactor());
	}
}
