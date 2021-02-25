package day04.ex;
/*
 	0 ~ 25 까지의 수를 랜덤하게 하나를 발생시켜서 
 		
 	 0 - 0입니다.
 	 2의배수 - 2의 배수이다.
 	 3의배수 - 3의 배수입니다.
 	 2와 3의 배수인 경우 - 2와 3의 배수입니다. 
 	 그 이외의 경우 - 나머지 수입니다.
 	 로 출력해주는 프로그램을 작성하세요. 
 */
public class Ex02 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * ( 25 - 0 + 1) + 0);
		String result = "";
			if(num != 0) {
			switch (num % 6) {
			case 0:
				result = "2와 3의 배수입니다.";
				break;
			case 2:
				result = "2의 배수입니다.";
				break;	
			case 3:
				result = "3의 배수입니다.";
				break;
			case 4:
				result = "2의 배수입니다.";
				break;
			default:
				result = " 나머지 수입니다.";
			}
		}
			else 
				result = "0 입니다.";
			
	
		System.out.println("입력 수는 " + num + " 이고"+ result);
	}
}

/*
int num2 = num % 2;
int num3 = num % 3;
int num6 = num % 6;
String result = "";

if (num == 0) {
	result = "0 입니다.";
}
else if (num6 == 0) {
	result = "2와 3의 배수입니다.";
}
else if (num3 == 0) {
	result = "3의 배수입니다.";
}
else if (num2 == 0 ) {
	result = "2의 배수입니다.";
}
else {
	result = "나머지 수입니다.";
}
System.out.println("입력한 수 " + num + " 은 " + result);
*/


