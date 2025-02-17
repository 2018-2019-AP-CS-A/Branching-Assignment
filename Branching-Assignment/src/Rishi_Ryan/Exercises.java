/**
 * @author Ryan Rishi
 */
package Rishi_Ryan;

public class Exercises 
{
	static int threeAndFive()
	{
		int sum=0;
		for(int i=0; i<1000; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	static int evenFibSum()
	{
		int i=1;
		int sum=0;
		int prev=1;
		int prev2=0;
		while(i<4000000)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			prev2=i;
			i=i+prev;
			prev=prev2;
		}
		return sum;
	}
	
	static int largestPrimeFactor()
	{
		 long num = 600851475143L;
	     for (int i = 3; i < num; i += 2) 
	     {
	    	 while (num % i == 0 && i < num) 
	         {
	    		 num /= i;
	         }
	     }
	      return (int) num;
	}
}

