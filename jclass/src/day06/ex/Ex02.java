package day06.ex;
/*
 	����2]
 		�����̰� ������ (100m)�� �ö󰣴�.
 		���̸� 0.87m�� �ö󰡰� 
 		���̸� 0.35m�� �̲����� �����´�.
 		
 		��ĥ���� �� �����̴� ���� �ö� ���ΰ�?
 		��, ����⿡ �ö󰡸� �̲����� ����.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int day = 0;
		double snail = 0;
		boolean complete = false;
		
		while(true) {
			day++;
			snail = snail + 0.87;
			if(snail >= 100) {
				complete = true;
				break;
			}
			snail = snail - 0.35;
		}
		if(complete) { // complete << complete == true
			System.out.println("�ݺ��� �߰��� ����!");
		}
		System.out.println("�����̴�" + day + "�ϸ��� ���� �ö󰩴ϴ�");
		/*
		for(int d = 1; ; d++) {
			if((0.52*d)>=(100-0.35)) {
				System.out.println(d + "��");
				break;
			}
		}
		*/
	}
}


