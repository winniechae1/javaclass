package day13.ex;
/*
 	����1]
 		���� ������ ����� �ϴ� Student Ŭ������ ���弼��.
 		�ʿ��� ������ �Լ����� ��� �ۼ��ؼ� ���弼��.
 		toString() �� �߰��ϼ���.
 		
 			String name;
 			int ban, no, kor, eng, math, total;
 			
 		�׸��� 5���� �л��� �����͸� �迭�� ��� ���뵵 ����ϼ���.
 		
 		�۾� ����]
 			1. �ʿ��� ������ ������ Ŭ������ �ۼ��Ѵ�.
 			2. �ʿ��� �����ڸ� �����Ѵ�.
 			3. Ex01 Ŭ���� ������ 5�� �л��� �����͸� �迭�� �����.
 			4. ����Ѵ�.  
 */
public class Ex01 {
	
	public Ex01() {
		Student[] stud = getStud();
		
		for(int i = 0; i < stud.length; i++) {
			System.out.println(stud[i]);
			/*
			 	println() �Լ��� toString �Լ��� �ڵ� ȣ���Ѵ�. 
			 */
		}
	}
	public Student [] getStud() {
		Student[] s = new Student[5];
		String[]  name = {"iu","lauv","ed","jacob","post"};
		int no = 1;
		//	�迭 ���� 
		for(int i = 0; i < s.length; i++) {
			//	���� ���� ���� �����ϰ� ����
			int k = (int)(Math.random() * 41 + 60);
			int e = (int)(Math.random() * 41 + 60);
			int m = (int)(Math.random() * 41 + 60);
			int ban = 2;
			
			//���� �� �濡 �ν��Ͻ��� ���� ����Ű��
//			s[i] = new Student(name[i], ban, no++, k, e, m);
			s[i] = new Student(name[i], ban, no++);
			s[i].setName(name[i]);
			s[i].setBan(ban);
			s[i].setNo(no++);
			s[i].setTotal();
			
		}
		return s; 
	}
	
	/*
	public Student[] setArrList() {
		
		String[] name = {"iu","lauv","ed","jacob","post"};
		int[] ban = {1, 2, 3, 4, 5};
		int[] no = {11, 22, 33, 44, 55};
		int[] kor = {50, 60, 70, 80, 90};
		int[] eng = {90, 80, 70, 60, 50};
		int[] math = {70, 60, 50, 40, 30};
		
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].setName(name[i]);
			s[i].setBan(ban[i]);
			s[i].setNo(no[i]);
			s[i].setEng(eng[i]);
			s[i].setMath(math[i]);
		}
		
		return s;
		
	}
	*/
	public void toPrint(Student[] s) {
		for(int i = 0; i < s.length-1; i++) {
			System.out.println(s[i].toString());
		}
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
