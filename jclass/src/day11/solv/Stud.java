package day11.solv;

public class Stud {
	public String name, id, mail, tell;
	public char gen;
	
	//	��µ� �Լ� 
	public void toPring() {
		System.out.printf("�� �� : %3s, ���̵� : %8s, �� �� : %20s, �޴��� : %13s, �� �� : %2c", 
				name, id, mail, tell, ((gen == 'M') ? "����" : "����"));
	}
}
