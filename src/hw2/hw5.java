package hw2;

public class hw5 {

	public static void main(String[] args) {
		int count = 0;
		System.out.print("阿文可以選擇的數字有: ");
		for (int x = 1; x <= 39; x++) {
			if (x / 10 == 4 || x % 10 == 4) {
				continue;
			}
			System.out.print(x + " ");
			count++;
		}
		System.out.println("\n總共有：" + count);
	}
}