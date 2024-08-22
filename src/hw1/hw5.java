package hw1;

public class hw5 {

	public static void main(String[] args) {
		// 1.通過指定運算子 = ，設定本金 p 值。
		int p=1500000;
		// 2.通過指定運算子 = ，設定2%年利率 r 值。
		double r=0.02;
		// 3.通過指定運算子 = ，設定每年複利的次數 n 值(每年複利一次，所以 𝑛=1)。
		int n=1;
		// 4.通過指定運算子 = ，設定時間 t 值。
		int t=10;
		// 5.通過算數運算子 / 和 * ，得出本金加利息 a 值。
		// 備註：通過 Math.pow 數字的次方。
		double a=p*Math.pow(1+r/n,n*t);
		// 6.輸出本金加利息 a 值。
		System.out.println("10年後本金加利息共有："+ a);
	}

}
