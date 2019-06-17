package dennis_bollettino;

public class Excercises 
{
	static int threeAndFive()
	{	
		int sum = 0; 
		int i = 3;
		while(i < 1000)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
			i++;
		}
		return sum;
	}

	static int evenFibSum()
	{
		int a = 1;
		int b = 1;
		int temp = 0;
		int sum = 0;
		while (a < 4000000 && b < 4000000)
		{
			if(b % 2 == 0)
			{
				sum += b;
			}
			temp = b;
			b = a + b;
			a = temp;
		}
		return sum;
	}

	static int largestPrimeFactor() 
	{ 
	    long maxPrime = -1; 

	   long n = 600851475143l; 
	    while (n % 2 == 0) { 
	        maxPrime = 2; 

	        // equivalent to n /= 2 
	        n >>= 1; 
	    } 

	   
	    for (int i = 3; i <= Math.sqrt(n); i += 2) { 
	        while (n % i == 0) { 
	            maxPrime = i; 
	            n = n / i; 
	        } 
	    } 

	   
	    if (n > 2) 
	        maxPrime = n; 

	    return (int)maxPrime; 
	} 

}
