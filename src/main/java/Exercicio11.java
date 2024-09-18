// IMPORTS
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// INSTANTIATE
		Scanner sc = new Scanner(System.in);

		// DECLARATE
		int a;
		int result;

		// COLLECT DATA
		System.out.print("A : ");
		a = sc.nextInt();

		// PROCESSING
		result = a % 2;

		// OUTPUT
		if (result == 0) {
			System.out.println(a);
		}
	}
}
