package day11;
/*
 	���� 5]
 		"1234 - 56" �� ���İ� ���� ���ں�ȣ���ڷ� ������ ���ڿ��� 
 		�Է¹޾Ƽ� ������ִ� ���� ���α׷��� �ۼ��ϼ���.
 		
 		����Լ�]
 			charAt()
 			length()
 			subString90
 			
 			Integer.parseInt
 			
 		>>	1. �Է¹޴� �Լ� 
 			2. �����ȣ�� ��ȯ���ִ� �Լ�
 			2.0 �����ȣ �ε��� ��ȯ���ִ� �Լ� 
 			 
 			3. ������ �Է��ϸ� ���ڸ� �迭�� ��ȯ���ִ� �Լ� 
 			4. ��� ó�����ִ� �Լ�
 */
import java.util.*;
public class Test01 {
	// ��ȯ���� �ִ� �Լ� �� Ŭ���� �̸��� ������ �Լ��� ������ �Լ��� �ƴ϶� �Ϲ��Լ��̴�.
	/*
	public void Test01() { 	
		System.out.println("#################################");
	}
	*/
	
	public Test01() {
//		System.out.println("### ����� �⺻ ������ ###");
		//	���� �Է¹ް� 
//		String str = inStr();
		//	���� ������ �����ϰ� 
//		double result = calc(str);
		
		//	������ְ� 
//		System.out.println("�Է��� ���� [ " + str + " ] �� ����� ==> " + result);
	}
	// ���ڿ� �Է� ����ó���Լ�
	public String inStr() {
		String str = "";
		//	�Էµ��� �غ��ϰ� 
		Scanner sc = new Scanner(System.in);
		//	�޽��� ����ϰ� 
		System.out.print("���� �Է� : ");
		//	�Է¹��� ������ ������ ����ϰ� 
		str = sc.nextLine();
		//	���ڿ� ��ȯ���ְ�		
		return str;
	}
	//	���ڿ����� �����ȣ�� �ε��� ��ȯ���ִ� �Լ� 
	public int getIdx(String str) {
		//	��ȯ�� ���� ����� 
		int idx = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '+') {
				//	�� ���� �����ȣ�� +�� ��� 
				idx = i;
				break;
			}else if(str.charAt(i) == '-') {
				idx = i;
				break;
			}else if(str.charAt(i) == '*') {
				idx = i;
				break;
			}else if(str.charAt(i) == '/') {
				idx = i;
				break;
			}else if(str.charAt(i) == '%') {
				idx = i;
				break;
			}
		}
		
		return idx;
	}
	
	//	�����ȣ ���ڿ��� ��ȯ���ִ� �Լ� 
	public String getBuho(String str, int idx) {
		String result = "";
		result = str.substring(idx, idx+1);
		return result;
	}
	/*
	 	���ڿ� ó�� �Լ� 
	 	
	 		charAt()
	 		>>	��ȯ��	: ����(char)
	 		indexOf()
	 		>>	��ȯ��	: ����(int)
	 		subString()
	 		>>	��ȯ��	: ���ڿ�(String)
	 		
	 		length()	
 			>>	��ȯ��	: ����(int)	- ���ڿ��� ���̸� ��ȯ���ش�.
 									- �������ε������� 1�� ũ��.
	 */
	//
	
	//	������ �Է��ϸ� ���ڸ� �迭�� ��ȯ���ִ� �Լ� 
	public int[] getNums(String str, int idx) {
		int[] num = new int[2];
		//	���ڿ��� �߶� 
		String sno1 = str.substring(0, idx);
		int no1 = Integer.parseInt(sno1);
		
		String sno2 = str.substring(idx+1);
		int no2 = Integer.parseInt(sno2);
		
		//	�迭�� ä���
		num[0] = no1;
		num[1] = no2;
		
		//	�ϼ��� �迭 ��ȯ���ְ�
		return num;
	}
	
	//	��� ó�����ִ� �Լ� 
	public double calc(String str) {
		double result = 0;
		
		//	�����ȣ �ε��� ����
		int idx = getIdx(str);
		
		//	�����ȣ ����
		String buho = getBuho(str, idx);
		
		//	���ڸ� �迭�� ����
		int[] nums = getNums(str, idx);
		
		//	��ȣ�� ���� ����ϰ� 
		
		switch(buho) {
		case "+":
			result = nums[0] + nums[1];
			break;
		case "-":
			result = nums[0] - nums[1];
			break;
		case "*":
			result = nums[0] * nums[1];
			break;
		case "/":
			result = ((double)nums[0]) / nums[1];
			break;
		case "%":
			result = nums[0] % nums[1];
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test01();	// ������ �Լ�
	}

}
