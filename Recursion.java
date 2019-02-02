public class Recursion {
    public static double guess(double n, double guess, double tolerance) {
	if (n / (guess * guess) <= tolerance) {
	    return guess;
	}else {
	    return guess(n, (n/guess + guess)/2, tolerance);
	}
    }
    public static double sqrt(double n, double tolerance) {
	if (n == 0) {
	    return 0;
	}else {
	    guess(n, n/4, tolerance);
	}
    }
}
