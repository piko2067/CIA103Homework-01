package hw3;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數。		
		Scanner sc = new Scanner(System.in);
		int a;
		while (true) {
			System.out.println("阿文...請輸入你討厭哪個數字? ");
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				if (a >= 1 && a < 10) {
					int count = 0;
					for (int x = 1; x <= 49; x++) {
						if (x / 10 == a || x % 10 == a) {
							continue;
						}
						System.out.print(x + " ");
						count++;
					}
					System.out.println("\n總共有：" + count);
					break;
				} else {
					System.out.println("錯誤! 請輸入1到9之間的數字!");
				}
			}
		}
	}
}
