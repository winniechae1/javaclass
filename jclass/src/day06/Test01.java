package day06;
/*
 	1 - 2 + 3 - 4 + 5 - 6 + ........ �����Ѵ�..
 	
 	ó�� 100�� �ѱ�� ����� ������ ȸ���� ����ϼ���.
 */
public class Test01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int gop = -1;
		int num = 0;
		for(int i = 1; ;i++) { // ���ǽĿ� �ƹ��͵� ������� ������ �׻� True�� ó���Ѵ�.
			gop = gop * -1;
			int no = i * gop;
			sum = sum + no;
			
			num = i;
			if(sum > 100) 
				break;
			// �̷��� ������ ������ ����� �Ѱ��� ���� �� ��ȣ�� �����ص� �ȴ�. 
		
		}
		System.out.println(num + " ���� ����� ����� " + sum + "���� ó�� 100�� �ѱ�� �ȴ�.");
	}

}
