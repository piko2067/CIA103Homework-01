package hw2;

public class Hw7 {

	public static void main(String[] args) {
		char x='A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
			x++;
		}
	}
}
