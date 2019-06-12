package Reger_Daniel;

/**
 * @author Daniel Reger
 */


public class Exercises 
{	
	/**
	 * 
	 * @return Returns the sum of multiples of 3 or 5 under 1000.
	 */
	static int threeAndFive()
	{
		int sum = 0;
		for (int x = 0; x<1000; x++)
		{
			if (x%5==0 || x%3==0)
			{
				sum = sum + x;
			}
		}
		return sum;
	}
	
	
	/**
	 * 
	 * @return Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence.
	 */
	static int evenFibSum()
	{
		
	int sumTotal = 2; int fib1 = 1; int fib2 = 2;
    int currFib = fib1 + fib2;
    while(currFib <= 4000000)
    	{
        sumTotal += IsEven(currFib);
        // Advance the fibanacci sequence.
        fib1 = fib2;
        fib2 = currFib;
        currFib = fib1 + fib2;
    	}
    return sumTotal;
	}

	static int IsEven(int num1)
	{   // Returns the number if it is even, return zero if an odd number.
	    if (num1 % 2 == 0)
	    {
	        return (num1);
	    }
	    return (0);
	}
	
	
	static long largestPrimeFactor()
	{
		long n = 600851475143l;
        long maxPrime = -1; 
        while (n % 2 == 0) { 
            maxPrime = 2; 
  
            // equivalent to n /= 2 
            n >>= 1; 
        } 
  
        // n must be odd at this point, 
        // thus skip the even numbers 
        // and iterate only for odd 
        // integers 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                maxPrime = i; 
                n = n / i; 
            } 
        } 
  
        // This condition is to handle 
        // the case when n is a prime 
        // number greater than 2 
        if (n > 2) 
            maxPrime = n; 
  
        return maxPrime; 
    } 
}
