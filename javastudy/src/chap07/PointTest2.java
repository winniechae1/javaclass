package chap07;
//	[7-8]

public class PointTest2 {
	public static void main(String[] args) {
		Point3D_01 p3 = new Point3D_01();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point_01 {
	int x = 10;
	int y = 20;
	
	Point_01(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D_01 extends Point_01{
	int z = 30;
	
	Point3D_01(){
		this(100, 200, 300);
	}
	Point3D_01(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}