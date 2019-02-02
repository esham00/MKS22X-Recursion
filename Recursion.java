public class Recursion {
    public static double guess(double n, double guess, double tolerance) {
	//if the guess^2 is close enough to n (determined by the tolerance), it returns the guess 
	if (n / (guess * guess) <= tolerance) {
	    return guess;
	}
	//conduct newton's sqrt approx
	else {
	    return guess(n, (n/guess + guess)/2, tolerance);
	}
    }
    public static double sqrt(double n, double tolerance) {
	//can't divide by zero
	if (n == 0) {
	    return 0;
	}
	//if n =/= 0, use the helped method, guess would be 1/4 of n
	else {
	    guess(n, n/4, tolerance);
	}
    }
    
}
