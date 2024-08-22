package hw2;

public class hw3 {

	public static void main(String[] args) {
		int sum = 1;
		int x = 1;
		while (x <= 10) {
			sum *= x;
			x++;
		}
		System.out.println("1~10的連乘積:" + sum);
	}

}
