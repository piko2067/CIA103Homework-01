package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw03 {
//	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	public static void main(String[] args) {
		Hw03 hw = new Hw03();
		hw.copyFile("C:\\CIA103_Workspace\\Homework-01\\src\\hw7\\input.txt",
				"C:\\CIA103_Workspace\\Homework-01\\src\\hw7\\output.txt");
	}

	public void copyFile(String in, String out) {
		File inputFile = new File(in);
		File outputFile = new File(out);

		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile);) {
			int c;
			byte[] buffer = new byte[1024];
			while ((c = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
