package day07;

import java.util.Arrays;

/*
 	1 ~ 45 ������ ������ �����ϰ� 6���� �߻��ؼ� 
 	�迭�� ��� 
 	�����ؼ� ����ϼ���. 
 */
public class Test08 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		loop:
		for(int i = 0; i < 6; i++) {
			// ���ڸ� �����.
			int no = (int)(Math.random() * 45 + 1);
			// ���ڰ� �̹� ����� ������ �ߺ�üũ�� �Ѵ�.
			for(int j = 0; j < i; j++) {
				int tmp = lotto[j];
				if(no == tmp) {
//					�̹� �ߺ��� ��ȣ�� ������� ���
					--i;
					continue loop;
				}
				
			}
			// �� ������ �����ϴ� ���� �ߺ�üũ�� ����� ���..
			// ���� �ش� �ε����� ���ڸ� ����Ų��. 
			lotto[i] = no;
		}
		System.out.println(Arrays.toString(lotto));
		// ���� 
		/*
		 	���]
		 		ù��°�� �ι�° �� --> ù��°�� �� ũ�� �ι�°�� �ڸ� �ٲٰ� 
		 								 ù��°�� ������ �׳� �����ϰ� 
		 				 ����° �� --> ù��°�� �� ũ�� ����°�� �ڸ� �ٲٰ� 
		 								 ù��°�� ������ �׳� �����ϰ� 
		 */
		for(int i = 0; i < lotto.length -1; i++) {
			/*
			int lo = lotto[i];
			for(int j = i+1; j < lotto.length; j++) {
				int hi = lotto[j];
				if(lo > hi) {
					lotto[i] = hi;
					lotto[j] = lo;
				}
			}
		*/
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					// ���� �ٲ� ��ġ�� �����͸� �����ѳ���
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			
			}
		}
		System.out.println("�̹��� �ζ� ��ȣ : " + Arrays.toString(lotto));
	}

}
