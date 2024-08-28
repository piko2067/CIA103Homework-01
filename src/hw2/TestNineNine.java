package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		使用for迴圈 + while迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 0;			
//			while (j++ <= 8)
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			System.out.println();
//		}

//		使用for迴圈 + do while迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//		}

//		使用while迴圈 + do while迴圈	
		int i, j;
		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
