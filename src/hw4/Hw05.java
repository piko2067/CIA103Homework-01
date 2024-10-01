package hw4;

import java.util.Scanner;

public class Hw05 {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年份 (yyyy): ");
		int year = sc.nextInt();

		System.out.print("請輸入月份 (mm): ");
		int month = sc.nextInt();

		System.out.print("請輸入日期 (dd): ");
		int day = sc.nextInt();

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		}
        
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i]; 
        }
        dayOfYear += day;

        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天。");
	}
}
