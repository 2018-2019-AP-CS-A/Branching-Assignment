package hom_nicholas;
/**@author Nicholas Hom**/
public class Exercises 
{
	static int threeAndFive()
	{
		int sum = 0;
		for(int i = 0; i < 1000; i = i + 1)
			if(i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		return sum;
	}
	
	static int evenFibSum()
	{
		int a = 1, b = 1;
		int total = 0;
		while (a <= 4000000)
		{
			if (a % 2 == 0)
				total += a;
		int temp = a;
		a = b;
		b = b + temp;
		}
		return total;
	}
	
	static int largestPrimeFactor()
	{
		int largest = 0;
		boolean prime = true;
		long num = 600851475143L;
		for(long i = 3; i < num; i = i + 2)
		{
			if(num % i == 0)
			{
				for(int j = 2; j < i; j++)
					if(i % j == 0)
						prime = false;
				if(prime == true)
					largest = (int) i;
			}
		}
		return largest;
	}

	public static void main(String[] args)
	{
		System.out.println(Exercises.threeAndFive());
		System.out.println(Exercises.evenFibSum());
		//System.out.println(Exercises.largestPrimeFactor());
	}
}
