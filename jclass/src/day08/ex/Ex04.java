package day08.ex;
/*
 	����4]
 		"1234 - 56" ���İ� ���� 
 		���ں�ȣ���ڷ� ������ ���ڿ��� �Է¹޾Ƽ� 
 		������ִ� ���� ���α׷��� �ۼ��ϼ���.
 		
 		����Լ�
 		charAt()
 		length()
 		subString()
 		
 		Integer.parseInt
 		
 */
import java.util.*;
public class Ex04 {

	   public static void main(String[] args) {
		      Scanner in = new Scanner(System.in);
		      
		      System.out.print("���� �Է� : ");
		      String str = in.nextLine();
		      
		      // �����ȣ�� ��ġ���� ����� ����
		      int idx = 0;
		      
		      // ������ �Ǵ� �����ȣ�� ��ġ���� �����Ѵ�.
		      for(int i = 0 ; i < str.length(); i++) {
		         char ch = str.charAt(i);
		         if(ch < '0' || ch > '9') {
		            idx = i;
		            break;
		         }
		      
		      }
		      
		      //�� �����͸� ����� ���ڿ� �����غ�
		      String sno1 =str.substring(0,idx);
		      String sno2 =str.substring(idx+1);
		      String buho =str.substring(idx,idx+1);
		            
		      // ���ڿ� ������ ���ڸ� ������ ��ȯ���ְ�
		      int no1 = Integer.parseInt(sno1);
		      int no2 = Integer.parseInt(sno2);
		      
		      //��� ����� ����
		      int result = 0;
		      
		      // ���� ��ȣ�� ���� ó��
		      switch(buho) {
		      case "+":
		         result = no1 + no2;
		         break;
		      case "-":
		         result = no1 - no2;
		         break;
		      case "*":
		         result = no1 * no2;
		         break;
		      case "/":
		         result = no1 / no2;
		         break;
		      case "%":
		         result = no1 % no2;
		         break;
		         
		      }
		      
		      // ��� ���
		      System.out.println(str+" �� ����� [" + result + "] �Դϴ�");
		      
		   }

		}
