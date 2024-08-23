package hw2;

public class Hw07 {

	public static void main(String[] args) {
		/*
		 請設計一隻Java程式,輸出結果為以下:
		 A
		 BB
		 CCC
		 DDDD
		 EEEEE
		 FFFFFF
		 */
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
