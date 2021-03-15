package day18;
/*
 	�л��� ������ �Է¹޾Ƽ� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
import java.text.*;
public class Test10 {

	public Test10() {
		double[] limits = {0, 60, 70, 80, 90};
		/*
		 	limits �迭�� ���� �� ���ǻ��� 
		 	�ݵ�� ������������ ���ĵǾ�� �Ѵ�.
		 	�̰��� �ǹ̴� 0 ~ 59  ���̴� �ϳ��� ���ڷ� �ٲٰ�
		 			      60 ~ 69 ���̴� �ϳ��� ���ڷ� �ٲٰ� 
		 				  70 ~ 79 ���̴� �ϳ��� ���ڷ� �ٲٰ�
		 				  
		 				  90 ~ 	�ϳ��� ���ڷ� �ٲټ���.
		 */
		String[] formats = {"F", "D", "C", "B", "A"};
		/*
		 	formats�� ���鶧 ���ǻ��� limits ������ �ݵ�� ��ġ�ؾ� �Ѵ�.
		 */
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		//	Ư�� ������ ���� �л��� ������ ����غ���.
		int score = 59;
		String grade = form.format(score);
		
		//	���
		System.out.println(score + " : " + grade + " ����");
	}

	public static void main(String[] args) {
		new Test10();
	}

}
