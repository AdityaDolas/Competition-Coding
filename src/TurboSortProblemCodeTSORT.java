import java.util.Arrays;
import java.util.Scanner;

class TurboSortProblemCodeTSORT {
	public static void main(String[] args) {
		// Taking input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = t;

		// Creating an array
		int arr[] = new int[t];

		// While loop for test cases

		// For loop to take inputs
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		// Sorting Array
		Arrays.sort(arr);

		// Printing Array
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
