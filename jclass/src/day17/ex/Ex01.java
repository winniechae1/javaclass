package day17.ex;
/*
 	����1]
 		�ﰢ���� ������ ����� Semo Ŭ������ �����ϰ� 
 		�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���. Semo1
 		�ﰢ���� �غ��� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���. Semo2
 		�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���. Semo3
 	
 */
public class Ex01 {
	
	public Ex01() {
		Semo1 s1 = new Semo1(8,4);
		System.out.println(s1);
		
		Semo1 s2 = new Semo1(16,2);
		System.out.println(s2);
	
		if(s1.equals(s2)) {
			System.out.println("�ﰢ���� ���̰� ����");
		}else {
			System.out.println("�ﰢ���� ���̰� �ٸ�");
		}
		System.out.println("---------------------------------");
		
		Semo2 s3 = new Semo2(4,4);
		System.out.println(s3);
		
		Semo2 s4 = new Semo2(4,2);
		System.out.println(s4);
	
		if(s3.equals(s4)) {
			System.out.println("�ﰢ���� �غ��� ����");
		}else {
			System.out.println("�ﰢ���� �غ��� �ٸ�");
		}
		System.out.println("---------------------------------");
		
		Semo3 s5 = new Semo3(8,1);
		System.out.println(s5);
		
		Semo3 s6 = new Semo3(16,4);
		System.out.println(s6);
	
		if(s5.equals(s6)) {
			System.out.println("�ﰢ���� ���̰� ����");
		}else {
			System.out.println("�ﰢ���� ���̰� �ٸ�");
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}