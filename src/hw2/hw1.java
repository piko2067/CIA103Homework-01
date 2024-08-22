package hw2;

public class hw1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 2; x <= 1000; x += 2) {
			sum += x;
		}
		System.out.println("1~1000的偶數和:" + sum);
	}
}
