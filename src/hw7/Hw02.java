package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Hw02 {
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//	append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		File file = new File("Data.txt");
		Set<Integer> set = new HashSet<>();
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\CIA103_Workspace\\Homework-01\\src\\hw7\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			while(set.size() < 10) {
				set.add((int)(Math.random() * 1000 + 1));
			}
            ps.println(set);

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
