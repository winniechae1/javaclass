package chap07;
/*
 	���������� ����ȯ 
 	�ڽ�Ÿ���� ����Ÿ������ ����ȯ : Up - casting (����ȯ ��������)
 	�θ�Ÿ���� �ڽ�Ÿ������ ����ȯ : Down - casting (����ȯ �����Ұ�)
 	
 	����ȯ�� ���������� Ÿ���� ��ȯ�ϴ� ������ �ν��Ͻ��� ��ȯ�ϴ� ���� �ƴϴ�. 
 	���� ���������� ����ȯ�� �ν��Ͻ��� �ƹ��� ������ ��ġ�� �ʴ´�.
 	[7-15]
 */
public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}