/**
 * @author Avijit S. Thapar
 * 
 * **/

package Thapar_Avijit;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i=0; i<1000; i++)
		{
			if (i%5==0 || i%3==0)
				sum+=i;
		}
		return sum;
	}

	public static int fibHelp(int n)
	{
		if(n <= 1){
			return n;
		}
		int fibo = 1;
		int fiboPrev = 1;
		for(int i = 2; i < n; ++i){
			int temp = fibo;
			fibo += fiboPrev;
			fiboPrev = temp;
		}
		return fibo;
	}

	public static int evenFibSum()
	{
		int sum = 0;
		int i = 0;
		while (fibHelp(i) < 4000000)
		{
			if (fibHelp(i)%2 == 0)
				sum += fibHelp(i);
			i++;
		}
		return sum;
	}

	public static int largestPrimeFactor()
	{
		int answer = 0;
		long currentNum = Long.parseLong("600851475143");
		boolean finLoop = true;
		while(finLoop)
		{
			int i = 1;
			boolean newNum=true;
			while(newNum)
			{
				i++;
				if(currentNum%i==0)
				{
					currentNum/=i;
					if(i>answer)
						answer=i;
					newNum=false;
				}
				else
				{
					if(i>=currentNum)
					{
						newNum=false;
						finLoop = false;
					}
				}

			}
		}
		return answer;
	}
}