package hw2;

public class Hw04 {

	public static void main(String[] args) {
		//請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		for (int x = 1; x <= 10; x++) {
			System.out.print(x * x);
			if (x < 10) {
				System.out.print(" ");
			}
		}
	}
}
