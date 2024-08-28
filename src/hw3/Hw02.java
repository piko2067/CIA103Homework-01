package hw3;
import java.util.Scanner;
public class Hw02 {
	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int seatNo = (int) (Math.random() * 10);
		int a;
		while (true) {
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				if (a == seatNo) {
					System.out.println("答對了答案就是" + seatNo);
					break;
				} else {
					System.out.println("猜錯了");
				}
			}
		}
	}
}
