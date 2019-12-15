import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNumbersProblemCodeFLOW001 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// Taking inpute using BufferedReader
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int t1 = Integer.parseInt(sc.readLine());

		int n1 = 0, n2 = 0;

		// Test cases while loop
		while (t1 > 0) {
			// Taking two inputs for addition
			n1 = Integer.parseInt(sc.readLine());
			n2 = Integer.parseInt(sc.readLine());
			System.out.println(n1 + n2);
			t1--;

		}

	}
}
