package hw4;

public class Hw02 {
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
	public static void main(String[] args) {
		String s = "Hello World";
		int i = s.length() - 1;
		for (int j = i; j >= 0; j--) {
			System.out.print(s.charAt(j));
		}
	}
}
