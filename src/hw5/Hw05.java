package hw5;

import java.util.Random;

public class Hw05 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static void main(String[] args) {
		int[] array = new int[62];
		for (int i = 0; i < array.length; i++)
			if (i < 10)
				array[i] = 48 + i; // 將數字 0-9ASCII碼(Int)放入 array[0-9]
			else if (i < 36)
				array[i] = 55 + i; // 將大寫英文 ASCII碼(Int)放入 array[10-35]
			else
				array[i] = 61 + i; // 將小寫英文 ASCII碼(Int)放入 array[36-61]

		int arryBsize = 8; // 取8個
		int[] arrayB = new int[arryBsize];
		Random r = new Random();
		for (int i = 0; i < arryBsize; i++)
			arrayB[i] = array[r.nextInt(62)]; // 從array陣列中取亂數0-62位置的元素放入arrayB陣列中

		for (int i = 0; i < arryBsize; i++)
			System.out.print((char) arrayB[i]); // 將 int 強制轉型 char 印出相對應 ASCII

	}

}