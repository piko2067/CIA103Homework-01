package hw4;

public class Hw03 {
//	有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	public static void main(String[] args) {
		String[] x = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length(); j++) {
				switch (x[i].charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					sum++;
					break;
				default:
				}
			}
		}
		System.out.print("陣列裡面共有" + sum + "個母音");
	}
}
