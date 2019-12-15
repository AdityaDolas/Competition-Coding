import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner; 

public class SmallfactorialsProblemCodeFCTRL2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// Taking input

		// BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		// int t = Integer.parseInt(sc.readLine());
		Long t = sc.nextLong();

		// while loop for test cases

		while (t > 0) {

			int n = sc.nextInt();
			
			System.out.println(factorial(n));

			t--;
		}
	}

	// Returns Factorial of N 
	static BigInteger factorial(int N) 
	{ 
		// Initialize result 
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 

		// Multiply f with 2, 3, ...N 
		for (int i = 2; i <= N; i++) 
			f = f.multiply(BigInteger.valueOf(i)); 

		return f; 
	} 

} 

