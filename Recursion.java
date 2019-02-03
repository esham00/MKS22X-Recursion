public class Recursion {
    public static double guess(double n, double guess, double tolerance) {
	//if the guess^2 is close enough to n (determined by the tolerance), it returns the guess 
	if (Math.abs(n - (guess * guess)) / n <= tolerance) {
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
	    return guess(n, n/4, tolerance);
	}
    }
    public static int linear(int term, int prev, int prev2) {
	if (term == 0) {
	    return prev2;
	} else {
	    return linear(term-1, prev+prev2, prev);
	}
    }
    public static int fib(int n) {
	return linear(n, 1, 0);
    }
    public static void main(String[] args) {
	System.out.println(sqrt(100.0, .000001));
	System.out.println(sqrt(2.0, .000001));
	for(int i = 0; i < 1000; i++) {
	    System.out.println(fib(i));
	}
    }
    
}
