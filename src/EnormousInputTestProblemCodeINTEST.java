import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnormousInputTestProblemCodeINTEST {
	public static void main(String[] args) throws IOException {

		// Taking inputs
		// Scanner sc = new Scanner(System.in);
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int t1 = Integer.parseInt(sc.readLine());
		int t2 = Integer.parseInt(sc.readLine());

		int ans = 0;

		while (t1 > 0) {
			int n = Integer.parseInt(sc.readLine());

			// Condition
			if (n % t2 == 0) {
				ans++;
			}
			t1--;
		}
		System.out.println(ans);
	}
}
