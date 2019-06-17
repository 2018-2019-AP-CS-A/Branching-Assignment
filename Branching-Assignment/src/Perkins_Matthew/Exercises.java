/**
 * @author Matthew Perkins
 */
package Perkins_Matthew;

public class Exercises
{
	public static int threeAndFive()
	{
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(i % 5 == 0 || i % 3 == 0)
				sum = i + sum;
		}
		return sum;
	}

	public static int evenFibSum()
	{
		int sum = 0, i = 1;
		while(fibHelp(i) < 4000000)
		{
			if(fibHelp(i)%2 == 0)
				sum = sum + fibHelp(i);
			i++;
		}
		return sum;
	}

	private static int fibHelp(int n)
	{
		if(n <= 2)
			return 1;
		else
			return fibHelp(n-1) + fibHelp(n-2);
	}

	public static int largestPrimeFactor()
	{
		int answer = -1;
		long currentNum = Long.parseLong("600851475143");
		boolean contFinalLoop = true;
		while(contFinalLoop)
		{
			int i = 1;
			boolean contNewNum=true;
			while(contNewNum)
			{
				i++;
				if(currentNum%i==0)
				{
					currentNum/=i;
					if(i>answer)
						answer=i;
					contNewNum=false;
				}
				else
				{
					if(i>=currentNum)
					{
						contNewNum=false;
						contFinalLoop = false;
					}
				}

			}
		}
		return answer;
	}
}
