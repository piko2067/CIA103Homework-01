package hw2;

public class Hw03 {

	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum = 1;
		int x = 1;
		while (x <= 10) {
			sum *= x;
			x++;
		}
		System.out.println("1~10的連乘積:" + sum);
	}

}
