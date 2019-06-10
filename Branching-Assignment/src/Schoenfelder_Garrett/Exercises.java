/**
 * @author Garrett Schoenfelder
 * 
 */

package Schoenfelder_Garrett;

import java.util.ArrayList;

public class Exercises {

	public static int threeAndFive()
	{
		ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> five = new ArrayList<Integer>();
	 
        int threetotal = 0;
        int fivetotal = 0;
        int total = 0;

        for(int i = 0; i < 1000 ; i++)
        {
            if(i % 3 == 0)
            {
                three.add(i);
                threetotal += i;
            }
            
            else if(i % 5 == 0)
            {
                five.add(i);
                fivetotal += i;
            }
        }
	    
	   total = fivetotal + threetotal;
	   return total;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		int i = 1;
		int before = 0;
		
		while (i < 4000000)
		{
			if (i % 2 == 0)
				sum += i;
			
			int temp = i;
			i = i + before;
			before = temp;
		}
		return sum;
	}
	public static int largestPrimeFactor()
	{
		long value = 600851475143L;

        while (value % 2 == 0) 
        value = value / 2;
        
        for (long factor = 3; factor < value; factor += 2) 
            while (value % factor == 0 && factor < value) 
                value = value / factor;
             
        return (int) value;
 
	}
}
