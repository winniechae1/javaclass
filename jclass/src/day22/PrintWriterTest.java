package day22;
/*
 	William Butler Yeats

Wine comes in at the mouth
And love comes in at the eye;
That’s all we shall know for truth
Before we grow old and die.
I lift the glass to my mouth,
I look at you, and sigh.
 */
import java.io.*;
public class PrintWriterTest {

	public PrintWriterTest() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("src/day22/data/darkingSong.poem");

			pw.println("A Drinking Song");
			pw.println();
			pw.println("William Butler Yeats");
			pw.println();
			pw.println("Wine comes in at the mouth");
			pw.println("And love comes in at the eye;");
			pw.println("That’s all we shall know for truth");
			pw.println("Before we grow old and die.");
			pw.println("I lift the glass to my mouth,");
			pw.println("I look at you, and sigh.");
			
			System.out.println("작업 종료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		 new PrintWriterTest();
	}

}
