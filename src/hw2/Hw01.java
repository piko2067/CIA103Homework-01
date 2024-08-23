package hw2;

public class Hw01 {

	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int x = 2; x <= 1000; x += 2) {
			sum += x;
		}
		System.out.println("1~1000的偶數和:" + sum);
	}
}
