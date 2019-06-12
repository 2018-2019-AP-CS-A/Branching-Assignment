package daniels_logan;

/** @author Logan Daniels */

public class Exercises {

	public static int threeAndFive() {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			if ((i % 3 == 0) || (i % 5 == 0))
				sum += i;
		return sum;
	}

	public static int evenFibSum() {
		int sum = 0;
		int x = 1;
		int y = 1;
		while ((x < 4000000) && (y < 4000000)) {
			if (((x + y) % 2) == 0)

				if (x <= y)
					x += y;
				else
					y += x;

		}
		return sum;

	}

	int largestPrimeFactor() {

		long num = 600851475143L;

		while (num % 2 == 0)
			num = num / 2;

		for (long factor = 3; factor < num; factor += 2)
			while (num % factor == 0 && factor < num)
				num = num / factor;

		return (int) num;

	}
}
