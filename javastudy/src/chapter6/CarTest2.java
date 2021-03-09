package chapter6;
/*
 	생성자에서 다른 생성자 호출하기 
 	생성자 간에도 서로 호출이 가능하다.
 	조건]
 		생성자 이름으로 클래스이름 대신 this를 사용한다.
 		한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 */

class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	Car2(String color) {
		this(color, "auto" , 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + 
				", door = " + c1.door);
System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}

}
