package hw9;
//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//	錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//	以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//	已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//	1000元,寫一個Java程式模擬匯款10次與提款10次的情
//	形。
class Depot {
	private int money = 0; 
	synchronized public void produce(int qty) {
		while (money > 3000 ) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			System.out.println("媽媽通知熊大，帳戶已有錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += qty;
		System.out.println("媽媽存了" + qty + "，帳戶共有：" + money);
		notify();
	}
	
	synchronized public void consume(int qty) {
		while (money < qty) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= qty;
		System.out.println("熊大領了" + qty + "，帳戶共有：" + money);
		if (money <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Producer extends Thread {
	Depot depot;
	public Producer(Depot depot) {
		this.depot = depot;
	}
	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.produce(2000);
	}
}

class Consumer extends Thread {
	Depot depot;
	public Consumer(Depot depot) {
		this.depot = depot;
	}
	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(1000); 
	}
}

public class Hw02 {
	public static void main(String[] args) {
		Depot depot = new Depot();				
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);

		producer.start(); 
		consumer.start();
	}
}

