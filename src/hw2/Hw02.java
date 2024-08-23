package hw2;

public class Hw02 {

	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum = 1;
		for (int x = 1; x <= 10; x++) {
			sum *= x;
		}
		System.out.println("1~10的連乘積:" + sum);
	}
}
