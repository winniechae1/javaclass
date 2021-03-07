package day13.ex;
/*
 	�� Ŭ������ �л� �Ѹ��� �̸�, ��, ��ȣ, ����, ����, ����, ����, ����� ����� Ŭ����
 */
public class Student {
	private String name;
	private int ban, no, kor, eng, math, total;
	private double avg;
	
	//	������ ������ �����ִ� �Լ��� 
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
	
	//	������ ������ �������ִ� �Լ��� 
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
	public void setTotal() {	// �����ε�
		total = kor + eng + math;
	}
	
	public String toString() {
		return "�̸� : "+ name + " �� : " + ban + " ��ȣ : " + no + " ���� : " + kor + "���� : "
				+eng + "���� : " + math + "���� : " + total + " ��� : " + Math.round(avg * 100)/100.0;
	}
	/*
	 	������ �Լ� 
	 	1. �⺻������
	 	2. �̸�, ��, ��ȣ�� �Է��ϴ� ������ 
	 	3. 2 + �������� 
	 	4. 3 + ���� + ��� 

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
