/**
@author Nathan Schnitzer
 **/


package Schnitzer_Nathan;

import java.util.ArrayList;

public class Excercises {

	static int threeAndFive()
	{
		int sum = 0;
		for (int i = 3; i < 1000; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				sum = sum + i;
			}
		}

		return sum;
	}

	static int evenFibSum()
	{
		int sum = 0;
		int x = 1, y = 1;

		while (x + y < 4000000)
		{
			int z = x + y;

			if (z % 2 == 0)
			{
				sum = sum + z;
			}

			x = y;
			y=z;
		}

		return sum;

	}

	static int largestPrimeFactor()
	{
		ArrayList<Long> list = new ArrayList<Long>();
		long n = 600851475143L;
		while (n%2==0) 
		{ 
			list.add(2L);
			n /= 2; 
		} 

		// n must be odd at this point.  So we can 
		// skip one element (Note i = i +2) 
		for (long i = 3L; i <= Math.sqrt(n); i+= 2) 
		{ 
			// While i divides n, print i and divide n 
			while (n%i == 0) 
			{ 
				list.add(i);
				n /= i; 
			} 
		} 

		// This condition is to handle the case whien 
		// n is a prime number greater than 2 
		if (n > 2) 
			list.add(n);

		long greatest = Long.MIN_VALUE;

		for (long l : list)
		{
			if (l > greatest)
			{
				greatest = l;
			}
		}

		return Integer.parseInt(Long.toString(greatest));
	}

}
