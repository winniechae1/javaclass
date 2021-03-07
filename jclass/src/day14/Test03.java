package day14;
/*
 	JFrame을 상속받은 클래스를 만들어보자.
 */
import javax.swing.*;
public class Test03 extends JFrame{
	
	public Test03() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 닫기버튼 기능 구현
		setSize(450, 500);
		// JFrame 을 상속받았기 때문에
		// 자동적으로 JFrame의 멤버는 이 클래스가 가지고 있는 상태가된다.
		// 따라서 상속해준 클래스의 멤버는 모두 사용할 수 있게 됐다.
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test03();
	}
}
