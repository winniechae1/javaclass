package day11.ex;
/*
 	����1]
 		�ﰢ���� ������ ����� Ŭ���� (Semo)�� �����ϰ� 
 		�� Ŭ������ Ÿ���� ������ 5���� ����� �迭�� ���� 
 		�غ� : xx - ���� : xx - ���� : xxx
 		�� �������� ����ϼ���.
 		�غ��� ���̴� �ν��Ͻ��� ��������� 5 ~ 15 ������ ������ �����ϰ� �Է��� �ǵ��� 
 		ó���ϼ���. ������ �Լ��� ó���ϼ���.
 */
public class Ex01 {

	public Ex01() {
		Semo[] semo = new Semo[5];
		for(int i = 0; i < semo.length; i++) {
			semo[i] = new Semo();
		}
		
		 for(int i = 0; i < semo.length; i++){
		
		 }
		
		for(Semo s : semo) {
			int width = s.width;
			int height = s.height;
			double area = s.getArea();
			System.out.printf("�غ� : %d  ,  ���� : %d ,  ���� : %3f \n" , width, height, area);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
