package hw9;

//  開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//  競賽過程。
//  每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//  Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//  參考範例:CounterRunnable.java
//  需留意主執行緒執行順序
public class Hw01 implements Runnable {
	
	int counter = 1;	// 計數器初始值為 1
	private String name;
	private int time;
	
	public Hw01() {
	} // 建構者函數
	
	Hw01(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	// 執行緒執行的邏輯定義在 run() 方法中
	public void run() { // 執行緒執行的地方
		while (counter <= 10) {	
			System.out.printf("%s吃了第%d碗飯\n", name, counter);// 輸出當前 counter 值
			counter++;					// 將 counter 加 1
			try {
				int random = (int) (Math.random() * 2500 + 500);
				time += random;
				Thread.sleep(random);
			} catch (Exception e) {
			}
		}System.out.printf("%s吃完了!\n", name);
	}

	public static void main(String arg[]) {
		// 產生兩個 CounterRunnable 物件
		Hw01 r1 = new Hw01("饅頭士", 0);
		Thread t1 = new Thread(r1); 
		Hw01 r2 = new Hw01("詹姆人", 0);
		Thread t2 = new Thread(r2);
		// 啟動兩個執行緒
		System.out.println("-----大胃王快食物比賽開始!-----");
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食物比賽結束!-----");
	}
}

