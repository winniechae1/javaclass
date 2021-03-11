package chap07;
/*
 	[7-7]
 	super() 는 조상클래스의 생성자를 호출하는데 사용된다.
 */

class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
	}
}
class Point1 {
	int x;
	int y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point1 {
	int z;
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	String getLocation() {	// 오버라이딩	상속받은 메서드의 내용을 변경하는 것.
		return "x :" + x + ", y" + ", z" + z;
	}
}