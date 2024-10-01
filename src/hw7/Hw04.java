package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw04 {
//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	public static void main(String[] args) {
		// 1. Dog 與 Cat 類別分別產生兩個物件
		Dog[] dogs = { new Dog("Dog1"), new Dog("Dog2") };
		Cat[] cats = { new Cat("Cat1"), new Cat("Cat2") };

		// 2. 檢查並建立 C:\data 資料夾
		File dataDir = new File("C:\\data");
		if (!dataDir.exists()) {
			dataDir.mkdirs(); // 確保資料夾存在
		}

		// 3. 寫入物件到 C:\data\Object.ser 檔案裡
		try (FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// 將狗和貓物件分別寫入檔案
			for (Dog dog : dogs) {
				oos.writeObject(dog);
			}
			for (Cat cat : cats) {
				oos.writeObject(cat);
			}

			System.out.println("物件已成功寫入到 C:\\data\\Object.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 讀取 Object.ser 這四個物件並執行 speak() 方法
		try (FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			System.out.println("C:\\data\\Object.ser 檔案內容如下:");
			System.out.println("--------------------");

			while (true) {
				try {
					// 使用多型讀取物件，並執行 speak() 方法
					Animal animal = (Animal) ois.readObject();
					animal.speak();
					System.out.println("--------------------");
				} catch (EOFException e) {
					System.out.println("資料讀取完畢！");
					break; // 結束迴圈
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}