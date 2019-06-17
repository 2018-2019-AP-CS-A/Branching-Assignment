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
		long root = 600851475143L;
		long factor = 2;
		while(root > factor)
		{
			if(root % factor == 0)
			{
				root = root/factor;
				factor = 2;
			}
			else
				factor++;
		}
		return (int)root;
	}

	public static void main(String[] args)
	{
		System.out.println(Exercises.threeAndFive());
		System.out.println(Exercises.evenFibSum());
		System.out.println(Exercises.largestPrimeFactor());
	}
}
