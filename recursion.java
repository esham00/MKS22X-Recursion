 import java.util.*;
public class recursion {
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
	//if there is no addition needed, return the last second term
	if (term == 0) {
	    return prev2;
	}
	//if it isnt the last term, then return the addition of the previous 2 terms 
	else {
	    return linear(term-1, prev+prev2, prev);
	}
    }
    public static int fib(int n) {
	return linear(n, 1, 0);
    }
    public static void sums(ArrayList<Integer> s, int n, int added, int notAdded) {
	if (n != 0) {
	    s.add(added);
	    sums(s, n-1, n-1+added, added);
	    sums(s, n-1, notAdded+n-1,notAdded);
	}
    }
    public static ArrayList<Integer> makeAllSums(int n) {
	ArrayList<Integer> sums = new ArrayList<Integer>(n * n + 1);
	sums(sums, n, 0,3);
	return sums;
    }
    // public static void testFib(int testcase){
    // 	recursion r = new recursion();
    // 	int[] input = {0,1,2,3,5,30};
    // 	int[] output ={0,1,1,2,5,832040};
    // 	int max = input.length;
    // 	if(testcase < input.length){
    // 	    int in = input[testcase];
    // 	    try{
     
    // 		int ans = r.fib(in);
    // 		int correct = output[testcase];
    // 		if(ans == correct){
    // 		    System.out.println("PASS test fib "+in+". "+correct);
    // 		}
    // 		else{
    // 		    System.out.println("FAIL test fib"+in+". "+ans+" vs "+correct);
       
    // 		}
    // 	    }catch(IllegalArgumentException n){
    // 		if(in < 0){
    // 		    System.out.println("PASS test fib"+in+" IllegalArgumentException");
    // 		}else{
    // 		    System.out.println(" FAIL IllegalArgumentException in test case:"+in);
    // 		}
    // 	    }catch(Exception e){
    // 		System.out.println(" FAIL Some exception in test case:"+in);
    // 	    }
    // 	}
    // }


    // //testcase must be a valid index of your input/output array
    // public static void testSqrt(int testcase){
    // 	recursion r = new recursion();
    // 	double[] input = {0.0,1.0, 2.0, 4.0, 7.0};
    // 	double[] output = {0.0,1.0,1.4142135623730951,2.0,2.6457513110645907};
    // 	int max = input.length;
    // 	if(testcase < input.length){
    // 	    double in = input[testcase];
    // 	    try{
     
    // 		double ans = r.sqrt(in,.00001);
    // 		double correct = Math.sqrt(in);
    // 		if(closeEnough(ans,correct)){
    // 		    System.out.println("PASS test sqrt "+in+" "+ans);
    // 		}
    // 		else{
    // 		    System.out.println("FAIL test sqrt "+in+" "+ans+" vs "+correct);
       
    // 		}
    // 	    }catch(IllegalArgumentException n){
    // 		if(in < 0){
    // 		    System.out.println("PASS test sqrt"+in+" IllegalArgumentException");
    // 		}else{
    // 		    System.out.println(" FAIL IllegalArgumentException in test case:"+in);
    // 		}
    // 	    }catch(Exception e){
    // 		System.out.println(" FAIL Some exception in test case:"+in);
    // 	    }
    // 	}
    // }
    // public static boolean closeEnough(double ans, double correct) {
    //     if (Math.abs(ans - correct) / ans <= .00001) {
    // 	    return true;
    // 	}
    // 	else {
    // 	    return false;
    // 	}
    // }
    // public static void main(String[] args) {
    // 	for(int i = 0; i < 6; i++) {
    // 	    testFib(i);
    // 	    testSqrt(i);
    // 	}
    // }
    
}
