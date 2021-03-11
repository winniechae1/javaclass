package day17.ex;
/*
 	문제1]
 		삼각형의 정보를 기억할 Semo 클래스를 제작하고 
 		삼각형의 넓이가 같으면 같은 삼각형으로 처리되도록 하세요. Semo1
 		삼각형의 밑변이 같으면 같은 삼각형으로 처리되도록 하세요. Semo2
 		삼각형의 높이가 같으면 같은 삼각형으로 처리되도록 하세요. Semo3
 	
 */
public class Ex01 {
	
	public Ex01() {
		Semo1 s1 = new Semo1(8,4);
		System.out.println(s1);
		
		Semo1 s2 = new Semo1(16,2);
		System.out.println(s2);
	
		if(s1.equals(s2)) {
			System.out.println("삼각형의 넓이가 같음");
		}else {
			System.out.println("삼각형의 넓이가 다름");
		}
		System.out.println("---------------------------------");
		
		Semo2 s3 = new Semo2(4,4);
		System.out.println(s3);
		
		Semo2 s4 = new Semo2(4,2);
		System.out.println(s4);
	
		if(s3.equals(s4)) {
			System.out.println("삼각형의 밑변이 같음");
		}else {
			System.out.println("삼각형의 밑변이 다름");
		}
		System.out.println("---------------------------------");
		
		Semo3 s5 = new Semo3(8,1);
		System.out.println(s5);
		
		Semo3 s6 = new Semo3(16,4);
		System.out.println(s6);
	
		if(s5.equals(s6)) {
			System.out.println("삼각형의 높이가 같음");
		}else {
			System.out.println("삼각형의 높이가 다름");
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}