package hw1;

public class Hw3 {

	public static void main(String[] args) {
		// 1.通過指定運算子 = ，設定總秒數。
		double Second=256559;
		// 2.通過算數運算子 / 計算總天數。
		double day=Second/60/60/24;
		// 3.輸出256559秒，總共天數。
		System.out.println("總天數："+day);
		// 4.通過算數運算子 * 計算總時數，並輸出256559秒，總共時數。
		System.out.println("總時數："+day*24);
		// 5.通過算數運算子 * 計算總分數，並輸出256559秒，總共分數。
		System.out.println("總分數："+day*24*60);
		// 6.通過算數運算子 * 計算總秒數，並輸出256559秒，總共秒數。
		System.out.println("總秒數："+day*24*60*60);
	}

}
