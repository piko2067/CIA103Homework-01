package hw2;

public class Hw2 {

	public static void main(String[] args) {
		int sum = 1;
		for (int x = 1; x <= 10; x++) {
			sum *= x;
		}
		System.out.println("1~10的連乘積:" + sum);
	}
}
