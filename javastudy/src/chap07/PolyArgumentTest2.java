package chap07;
//	[7-22]

class Ware {
	int price;
	int bonusPoint;
	
	Ware(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Ware(){
		
	}
}
class LGTv extends Ware {
	LGTv() {
		super(100);
	}
	public String toString() {
		return "LGTv";
	}
}

class LGcpu extends Ware {
	LGcpu(){
		super(200);
	}
		public String toString() {
			return "LGcpu";
		}
	}
class LGaudio extends Ware {
	LGaudio(){
		super(50);
	}
	public String toString() {
		return "LGaudio";
	}
}
class Consumer {
	int money = 1000;
	int bonusPoint = 0;
	Ware[] item = new Ware[10];
	int i = 0;
	
	void buy(Ware w) {
		if(money < w.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= w.price;
		bonusPoint += w.bonusPoint;
		item[i++] = w;
		System.out.println(w + "��/�� �����ϼ̽��ϴ�.");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) 
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Consumer c = new Consumer();
		
		c.buy(new LGTv());
		c.buy(new LGcpu());
		c.buy(new LGaudio());
		c.summary();
	}

}
