package chap06;

public class E6_2 {
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
		t1.channel = 7; 
		System.out.println("t1�� channel ���� 7�� �����߽��ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
	}
}

class Tv2 {
	String color;
	boolean power;
	int channel;
	
	void power() { power =  !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}