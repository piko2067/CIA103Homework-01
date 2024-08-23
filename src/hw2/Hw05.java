package hw2;

public class Hw05 {

	public static void main(String[] args) {
		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
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