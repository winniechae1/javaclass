package day05_run.ex;
/*
���� 8 ]
	3 ~ 100 ������ ���ڸ� �����ϰ� �߻����Ѽ�
	�߻��� ���ڰ� �ڼ������� �Ǵ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	���� ]
		�ڼ� : 1�� �ڱ��ڽ����θ� ������ �ִ� ��
		
		�� ]
			2, 3, 5, 7, ....
*/
public class Ex08 {
	public static void main(String[] args) {
		
		int no = (int)(Math.random() * (100-3+1)+3);
		String result = "�Ҽ��Դϴ�.";
		
		for(int i=2; i<no; i++) {
			if(no%i == 0) {
				result = "�Ҽ��� �ƴմϴ�.";
				break;
			}
		}
		System.out.println(no+" ��"+result);
	}
	
}
