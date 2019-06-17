package Deffigos_Chris;
/**
 * @author Ashley Chiu //include this tag in your classes with your name
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "New pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */
public class Exercises
{
	
	public static int threeAndFive()
	{
		int count = 0;
		int multThree = 0;
		int multFive = 0;
		
		while (count < 1000)
		{
			if (count % 3 == 0)
				multThree = multThree + count;
			
			if (count % 5 == 0)
				multFive = multFive + count;
		}
		
		int total = multThree + multFive;
		count = 0;
		return total;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 4000000; i++)
		{
			count = i;
			sum = sum + i;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long number = 600851475143L;
		long factor = 2;
		
		for (long i = 2L; i <= number / 2; i++)
		{
			if (number / i == )
		}
	}
}
