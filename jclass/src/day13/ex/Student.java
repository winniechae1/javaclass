package day13.ex;
/*
 	이 클래스는 학생 한명의 이름, 반, 번호, 국어, 영어, 수학, 총점, 평균을 기억할 클래스
 */
public class Student {
	private String name;
	private int ban, no, kor, eng, math, total;
	private double avg;
	
	//	변수의 내용을 꺼내주는 함수들 
	public String getName() {
		return name;
	}
	public int getBan() {
		return ban;
	}
	public int getNo() {
		return no;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	
	//	변수의 내용을 세팅해주는 함수들 
	public void setName(String n) {
		name = n;
	}
	public void setBan(int b) {
		ban = b;
	}
	public void setNo(int n) {
		no = n;
	}
	public void setKor(int k) {
		kor = k;
	}
	public void setEng(int e) {
		eng = e;
	}
	public void setMath(int m) {
		math = m;
	}
	public void setTotal(int t) {
		total = t;
	}
	public void setAvg(double a) {
		avg = a;
	}
	public void setAvg() {
		avg = total / 3.0;
	}
	public void setTotal() {	// 오버로딩
		total = kor + eng + math;
	}
	
	public String toString() {
		return "이름 : "+ name + " 반 : " + ban + " 번호 : " + no + " 국어 : " + kor + "영어 : "
				+eng + "수학 : " + math + "총점 : " + total + " 평균 : " + Math.round(avg * 100)/100.0;
	}
	/*
	 	생성자 함수 
	 	1. 기본생성자
	 	2. 이름, 반, 번호만 입력하는 생성자 
	 	3. 2 + 과목점수 
	 	4. 3 + 총점 + 평균 

	 */
	
	// 1 
	public Student() {}
	// 2
	public Student(String irum, int b, int n) {
		name = irum;
		ban = b;
		no = n;
	}
	public Student(String irum, int b, int n, int k, int e, int m, int t, double a) {
		/*
		 name = irum;
		 ban = b;
		 no = n;
		 */
		this(irum, b, n);
		kor = k;
		eng = e;
		math = m;
		total = t;
		avg = a;
		
	}
	
	
}
