package hw4;

public class Hw06 {
//	班上有8位同學,他們進行了6次考試結果如下:
//	10, 35, 40, 100, 90, 85, 75, 70  
//	37, 75, 77, 89, 64, 75, 70, 95 
//	100, 70, 79, 90, 75, 70, 79, 90 
//	77, 95, 70, 89, 60, 75, 85, 89
//	98, 70, 89, 90, 75, 90, 89, 90 
//	90, 80, 100, 75, 50, 20, 99, 75
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)
	public static void main(String[] args) {
		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 },
						   { 37, 75, 77, 89, 64, 75, 70, 95 }, 
						   { 100, 70, 79, 90, 75, 70, 79, 90 },
						   { 77, 95, 70, 89, 60, 75, 85, 89 }, 
						   { 98, 70, 89, 90, 75, 90, 89, 90 },
						   { 90, 80, 100, 75, 50, 20, 99, 75 } };
        int[] count = new int[8]; 

        for (int i = 0; i < scores.length; i++) { 
            int maxScore = scores[i][0]; 
            int maxIndex = 0; 

            // 找出這次考試的最高分及其索引
            for (int j = 1; j < scores[i].length; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxIndex = j;
                }
            }
            count[maxIndex]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("同學 " + (i + 1) + " 考得最高分的次數: " + count[i]);
        }
    }
}