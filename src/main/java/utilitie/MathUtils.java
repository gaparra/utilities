package utilitie;

public final class MathUtils {
	
	private MathUtils() {
		
	}
	
	static int square(int number) {
		int result = number * number; 
		return result;
	}
	static double factorial(int number) {
		double total = 1;
		for(int i = 1; i <= number; i++) {
			total *= i;
		}
		return total;
	}
	static boolean isPrime(int number) {
		boolean result = true;
		for(int i = 2; i < number; i++) {
			if(number % i == 0 && i != number) {
				result = false;
			}
		}
		return result;
	}
}
