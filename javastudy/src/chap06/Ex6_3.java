package chap06;

public class Ex6_3 {
	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		System.out.println("t1�� channel ����" + t1.channel +" �Դϴ�");
		System.out.println("t2�� channel ����" + t2.channel +" �Դϴ�");
		
		t2 = t1;
		t1.channel = 7; 
		System.out.println("t1�� channel ���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel +" �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel +" �Դϴ�.");
		
		t1.color = "yellow";
		System.out.println(t1.color);
		
	}
}

class Tv3 { 
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
