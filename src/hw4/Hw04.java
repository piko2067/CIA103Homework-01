package hw4;

import java.util.Scanner;

public class Hw04 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
//	其員工編號與身上現金列表如下:	員工編號	25		32		9		19		27
//								身上現金	2500	800		500		1000	1200
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//	並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)

	public static void main(String[] args) {
		int[][] intArray = { { 25, 32, 9, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入欲借的金額:");
		int money = sc.nextInt();
		
		int count=0;
		for(int i=0;i<intArray[0].length;i++) {
			if(intArray[1][i]>=money) {
				System.out.print(intArray[0][i] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人");
	}
}
