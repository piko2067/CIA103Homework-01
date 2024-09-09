package hw3;

import java.util.Scanner;

public class Hw02 {
	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//		Scanner sc = new Scanner(System.in);
//		System.out.println("開始猜數字吧!");
//		int seatNo = (int) (Math.random() * 10);
//		int a;
//		while (true) {
//			if (sc.hasNextInt()) {
//				a = sc.nextInt();
//				if (a == seatNo) {
//					System.out.println("答對了答案就是" + seatNo);
//					break;
//				} else {
//					System.out.println("猜錯了");
//				}
//			}
//		}
//		進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int seatNo = (int) (Math.random() * 101);
		int a;
		while (true) {
			System.out.println("請輸入1到100之間的數字：");
			if (sc.hasNextInt()) {
				a = sc.nextInt();
				if (a >= 0 && a <= 100) {
					if (a == seatNo) {
						System.out.println("答對了答案就是" + seatNo);
						break;
					} else if (a > seatNo) {
						System.out.println("猜錯了!數字要更小");
					} else {
						System.out.println("猜錯了!數字要更大");
					}
				} else {
					System.out.println("錯誤! 請輸入1到100之間的數字!");
				}
			}
		}
	}
}
