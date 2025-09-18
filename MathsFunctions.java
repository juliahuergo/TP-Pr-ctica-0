package tp.pr0;

public class MathsFunctions {
	
	public static int factorial(int n){
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else {
			int total = 1;
			for(int i = n; i>0; i--)
				total *= i;
			return total;
		}
	}
	
	public static int combinatorial(int n, int k) {
		if (k>n) {
			return 0;
		}
		else {
			return factorial(n) / (factorial(k) * factorial(n-k));
		}
	}
}
