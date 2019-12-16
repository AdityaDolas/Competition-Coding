import java.util.Scanner;

class SumofDigitsProblemCodeFLOW006 {
	public static void main(String[] args) {

		// Taking inpute
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int z = t;

		while (z > 0) {

			int sum = 0;
			int n = sc.nextInt();
			int x = n;

			while (x > 0) {
				int r = n % 10;
				sum = sum + r;
				n = n / 10;
				x--;
			}
			System.out.println(sum);
			z--;
		}
	}
}
