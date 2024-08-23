package hw1;

public class Hw04 {

	public static void main(String[] args) {
		// 1.通過指定運算子 = ，設定 π 值。
		double π=3.1415;
		// 2.通過指定運算子 = ，設定半徑數值。
		double radius=5;
		// 3.通過算數運算子 * ，算出圓的面積，並將其結果輸出。(備註：園面積公式=πr2)
		System.out.println("圓的面積："+ π*(radius*radius));
		// 4.通過算數運算子 * ，算出圓的周長，並將其結果輸出。(備註：園周長公式=2πr)
		System.out.println("圓的圓周長："+ 2*π*radius);
	}

}
