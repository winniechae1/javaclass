package day07;

import java.util.Arrays;

/*
	�����ϰ� 1 ~ 45 ������ ���ڸ� 6�� �߻����Ѽ� ����Ű�� 
	�迭�� ����� �� �迭�� ������ �迭 5���� ���� 
	�� 5������ �ζǹ�ȣ�� ���弼��.
 */
public class Lotto {

	public static void main(String[] args) {
		// ���� �ټ������� ����� �迭�� �����.
		// ������ �迭�� �ȴ�. 
		/*
		 	������ �迭�̶� 
		 		�迭�ȿ� �ٽ� �迭�� ���Ǵ� ���¸� �ǹ��Ѵ�. 
		 		
		 		����]
		 			2�����迭
		 				int[][] no = new int[5][6];
		 				
		 				no[0] >> ���� �迭�� �ȴ�. ù��° �迭�� �ǹ��Ѵ�.
		 				no[0][0] >> �迭�� ù��° ���� �迭�� ù��° �����͸� �ǹ��Ѵ�.
		 				
		 */
		// �迭 �ּҸ� �����.
		int[][] lotto = new int[5][6];
		/*
		 	int[] num = {1, 2, 3};   
		 	num.length ==> 3
		 	
		 	lotto[1].length ==> lotto �迭�� �ι�° ���� �迭�� ũ��
		 */
		for(int l = 0; l < lotto.length; l++) {
			
			int[] l1= lotto[l];
			
			loop:
			for(int i = 0; i < l1.length; i++) {
				// �����ϰ� ���ڸ� �����
				int no = (int)(Math.random() * 45 + 1);
				// �ߺ��˻�
				for(int j = 0; j < i; j++) {
					if(l1[j] == no) {
						--i;
						continue loop;
					}
				}
				l1[i] = no;
			}
		}
	
		// �迭�� ������ ����غ���. 
		for(int[] t : lotto) {
			System.out.println(Arrays.toString(t));
		}
		System.out.println("=====================================");
		// �������ش�.
		for(int l = 0; l < lotto.length; l++) {
			int[] lt = lotto[l];
			
			for(int i = 0; i < lt.length - 1; i++) {
				for(int j = i + 1; j < lt.length; j++) {
					if(lt[i] > lt[j]) {
						int tmp = lt[i];
						lt[i] = lt[j];
						lt[j] = tmp;
					}
				}
			}
		}
		for(int[] t : lotto) {
			System.out.println(Arrays.toString(t));
		}
	}

}
