/**
 * @author Matthew Mascolo //include this tag in your classes with your name
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

package mascolo_matthew;

public class Exercises 
{
	static int threeAndFive() //Returns the sum of all the multiples of 3 or 5 below 1000
	{
		int sum=0;
		
		for(int i=3; i<1000; i++)
		{
			if(i%3 == 0)
			{
				sum = sum + i;
			}
			else
			{
				if(i%5 == 0)
				{
					sum = sum + i;
				}
			}
		}
		return sum;
	}
	
	static int evenFibSum() //Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
	{
		int previousNum = 0;
		int nextNum = 1;
		int sum = 0;
		int evenSum = 0;
		
		while(sum < 4000000)
		{
			sum = previousNum + nextNum;
			
			if(nextNum%2 == 0)
			{
				evenSum = nextNum + evenSum;
			}
			previousNum = nextNum;
			nextNum = sum;
		}
		return evenSum;
	}
	
	static int largestPrimeFactor() //Returns the largest prime factor of the number 600851475143
	{
		 int i;
		 long number = 600851475143L;
		 
		 for(i =2; i <= number; i++)
		 {
			 if(number % i == 0)
			 {
				 number /= i;
				 i--;
			 }
		 }
		 return i;
	}
}


