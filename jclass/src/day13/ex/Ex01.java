package day13.ex;
/*
 	문제1]
 		다음 변수를 멤버로 하는 Student 클래스를 만드세요.
 		필요한 생성자 함수들을 모두 작성해서 만드세요.
 		toString() 도 추가하세요.
 		
 			String name;
 			int ban, no, kor, eng, math, total;
 			
 		그리고 5명의 학생의 데이터를 배열에 담고 내용도 출력하세요.
 		
 		작업 순서]
 			1. 필요한 변수를 가지는 클래스를 작성한다.
 			2. 필요한 생성자를 정의한다.
 			3. Ex01 클래스 내에서 5명 학생의 데이터를 배열로 만든다.
 			4. 출력한다.  
 */
public class Ex01 {
	
	public Ex01() {
		Student[] stud = getStud();
		
		for(int i = 0; i < stud.length; i++) {
			System.out.println(stud[i]);
			/*
			 	println() 함수는 toString 함수를 자동 호출한다. 
			 */
		}
	}
	public Student [] getStud() {
		Student[] s = new Student[5];
		String[]  name = {"iu","lauv","ed","jacob","post"};
		int no = 1;
		//	배열 세팅 
		for(int i = 0; i < s.length; i++) {
			//	먼저 과목별 점수 랜덤하게 설정
			int k = (int)(Math.random() * 41 + 60);
			int e = (int)(Math.random() * 41 + 60);
			int m = (int)(Math.random() * 41 + 60);
			int ban = 2;
			
			//먼저 각 방에 인스턴스를 만들어서 기억시키고
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
