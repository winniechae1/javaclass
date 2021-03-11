package chap07;
/*
 	�Ű������� ������
 	Tv t = new Tv(); 
 	b.buy(t); 
 	==> b.buy(new Tv());
 */
class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Telv extends Product {
	Telv(){
		super(100);
	}
	public String toString() {
		return "Telv";
	}
}

class Computer extends Product {
	Computer(){
		super(200);
	}
	public String toString() {
		return "computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Telv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}
}
