package chapter6;

class Tv1 {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class TVTest2 {

	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�.");
	}

}
