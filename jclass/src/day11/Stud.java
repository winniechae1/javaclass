package day11;

public class Stud {
	public String name, id, mail, tell;
	public char gen;
	
	public String toString() {
		String str = "�� �� : " + name + "\n���̵� : " + id + "\n�� �� : " + mail + 
					"\n�� ȭ : " + tell + "\n��	�� : " + ((gen == 'M') ? "����" : "����" );
		System.out.println();
		
		return str;
	}
/*
 	�� Ŭ����ó�� Ŭ���� ����� �����鸸���� ������ Ŭ������ VO(VALUE OBJECT) �Ǵ� DTO(Data Transfer Object)
 	��� �θ��� �̷� Ŭ������ ����ϴ� ������ �����͸� ������ �������� �̷� Ŭ������ ����Ѵ�.
 */
}
