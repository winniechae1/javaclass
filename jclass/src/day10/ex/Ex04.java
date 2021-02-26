package day10.ex;
/*
문제 4 ]
	1. 정수를 입력하면 그 정수에 해당하는 
		삼각형 배열을 기억할 배열을 반환해주는 함수
	2. 배열을 입력하면 배열의 삼각형들의 
		밑변, 높이 를 랜덤하게 셋팅해주는 함수
	3. 배열을 입력하면 배열의 삼각형들의 
		넓이를 입력해주는 함수
	4. 배열을 입력하면 배열의 삼각형들의 내용을 출력해주는 함수
		밑변 - 0000
		높이 - 0000
		넓이 - 0000
	5. 배열과 정수를 입력하면 배열의 정수 위치의 삼각형의
		정보를 출력해주는 함수
		
	를 만들어서 실행하세요.
 */
public class Ex04 {
	
	public Ex04() {
		int cnt = (int)(Math.random() * 9 + 1);
		double[][] tri = getTri(cnt);
		setArray(tri);
		setArea(tri);
		setPrint(tri);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	
	public double[][] getTri(int cnt){
		double[][] tri = new double[cnt][3];
		return tri;
	}
	public void setArray(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
			for(int j = 0; j < tri[i].length; j++) {
				int num = (int)(Math.random() * 41 + 10);
				tri[i][j] = num;
			}
		}
	}
	public void setArea(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
			tri[i][2] = tri[i][0] * tri[i][1] * 0.5;
		}
	}
	public void setPrint(double[][] tri) {
		for(int i = 0; i < tri.length; i++) {
				System.out.println("밑변 : " + tri[i][0] + "높이 : " + tri[i][1] + "넓이 : " + tri[i][2] );
			
		}
	}
}
