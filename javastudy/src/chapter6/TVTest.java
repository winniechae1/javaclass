package chapter6;

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channerUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class TVTest {
	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}
