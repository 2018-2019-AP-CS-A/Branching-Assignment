package Xu_Bill;

import java.math.BigInteger;

/**
@BillXu
*/

public class Exercises 
{
	public static int threeAndFive()
	{
		int result=0;
		for (int i=1; i<1000; i++)
		{
			if(i%3==0 || i%5==0)
				result+=i;
		}
		return result;
	}
	
	public static int evenFibSum()
	{
		int first=1, second=1, sum = 0;
		while(second<4000000 && first<400000)
		{
			first=first+second;
			if(first%2==0)
				sum+=first;
			second=second+first;
			if(second%2==0)
				sum+=second;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long num= 600851475143L;
		long i;
		
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
				num/=i;
		}
		
		return (int)num;
	}
	
	public static void main(String [ ] args)
	{
		System.out.println(threeAndFive());
		System.out.println(evenFibSum());
		System.out.println(largestPrimeFactor());
	}
}
