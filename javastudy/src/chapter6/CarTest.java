package chapter6;
/*
 	클래스를 작성할 때 다양한 생성자를 제공함으로써
 	인스턴스 생성 후에 별도로 초기화를 하지 않아도 됨 
 */

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		
	}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + 
							", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}

}
